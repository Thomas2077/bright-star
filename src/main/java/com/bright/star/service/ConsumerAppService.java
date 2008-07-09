package com.bright.star.service;

import cn.hutool.core.bean.BeanUtil;
import com.bright.star.controller.command.ConsumerQueryCommand;
import com.bright.star.controller.command.CustomerSaveCommand;
import com.bright.star.controller.command.CustomerUpdateCommand;
import com.bright.star.controller.vo.ConsumerWithWorkerVO;
import com.bright.star.infrastructure.common.BeanTools;
import com.bright.star.infrastructure.persistence.entity.TorihikisakiMain;
import com.bright.star.infrastructure.persistence.entity.TorihikisakiTantou;
import com.bright.star.service.app.TorihikisakiMainService;
import com.bright.star.service.app.TorihikisakiTantouService;
import com.bright.star.service.dto.TorihikisakiMainDTO;
import com.bright.star.service.dto.TorihikisakiTantouDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 取引先情報を管理する画面
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/11
 * @description
 **/
@Slf4j
@Service
@RequiredArgsConstructor
public class ConsumerAppService {

    private final TorihikisakiMainService torihikisakiMainService;
    private final TorihikisakiTantouService torihikisakiTantouService;

    /**
     * 取引先情報を検索する
     * @param command
     * @return
     */
    public List<ConsumerWithWorkerVO> queryByCondition(ConsumerQueryCommand command) {
        List<TorihikisakiMain> torihikisakiMainList = torihikisakiMainService.queryByCondition(command);

        return torihikisakiMainList.stream().map(torihikisaki -> {
            TorihikisakiMainDTO torihikisakiMainDTO = BeanUtil.copyProperties(torihikisaki, TorihikisakiMainDTO.class);
            List<TorihikisakiTantouDTO> torihikisakiTantouDTOList = BeanUtil.copyToList(torihikisakiTantouService.getByTorihikisaki(torihikisaki.getTorihikiId()), TorihikisakiTantouDTO.class);
            return new ConsumerWithWorkerVO(torihikisakiMainDTO, torihikisakiTantouDTOList);
        }).collect(Collectors.toList());
    }

    /**
     * 取引先情報を保存する
     * @param command
     * @return
     */
    @Transactional
    public void saveCustomer(CustomerSaveCommand command) {

        TorihikisakiMain torihikisakiMain = BeanTools.copyProperties(command.consumer(), new TorihikisakiMain());
        torihikisakiMainService.save(torihikisakiMain);

        List<TorihikisakiTantou> torihikisakiTantouList = BeanTools.copyToList(command.consumerTantouList(), TorihikisakiTantou.class);
        torihikisakiTantouService.saveBatch(torihikisakiTantouList);
    }

    /**
     * 取引先情報を更新する
     * @param command
     * @return
     */
    @Transactional
    public void updateCustomer(CustomerUpdateCommand command) {
        torihikisakiMainService.updateById(BeanTools.copyProperties(command.torihikisakiMainDTO(),  new TorihikisakiMain()));
        torihikisakiTantouService.updateBatchById(BeanTools.copyToList(command.torihikisakiTantouDTO(), TorihikisakiTantou.class));
    }

    public void deleteCustomer(Integer torihikiId){
        torihikisakiMainService.removeById(torihikiId);
    }

    public List<TorihikisakiTantouDTO> getTantouByConsumerId(Integer id) {
        List<TorihikisakiTantou> tantouList = torihikisakiTantouService.getByTorihikisaki(id);
        return BeanTools.copyToList(tantouList, TorihikisakiTantouDTO.class);
    }
}
