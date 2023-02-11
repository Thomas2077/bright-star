package com.bright.star.service;

import cn.hutool.core.bean.BeanUtil;
import com.bright.star.controller.command.CustomerQueryCommand;
import com.bright.star.controller.command.CustomerSaveCommand;
import com.bright.star.controller.command.CustomerUpdateCommand;
import com.bright.star.infrastructure.persistence.entity.TorihikisakiMain;
import com.bright.star.infrastructure.persistence.entity.TorihikisakiTantou;
import com.bright.star.service.app.TorihikisakiMainService;
import com.bright.star.service.app.TorihikisakiTantouService;
import com.bright.star.service.dto.TorihikisakiMainDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
public class CustomerAppService {

    private final TorihikisakiMainService torihikisakiMainService;
    private final TorihikisakiTantouService torihikisakiTantouService;

    /**
     * 取引先情報を検索する
     * @param command
     * @return
     */
    public List<TorihikisakiMainDTO> queryByCondition(CustomerQueryCommand command) {
        List<TorihikisakiMain> torihikisakiMainList = torihikisakiMainService.queryByCondition(command);
        return BeanUtil.copyToList(torihikisakiMainList, TorihikisakiMainDTO.class);
    }

    /**
     * 取引先情報を保存する
     * @param command
     * @return
     */
    @Transactional
    public void saveCustomer(CustomerSaveCommand command) {
        torihikisakiMainService.save(BeanUtil.copyProperties(command.torihikisakiMainDTO(), TorihikisakiMain.class));
        torihikisakiTantouService.saveBatch(BeanUtil.copyToList(command.torihikisakiTantouDTO(), TorihikisakiTantou.class));
    }
    /**
     * 取引先情報を更新する
     * @param command
     * @return
     */
    @Transactional
    public void updateCustomer(CustomerUpdateCommand command) {
        torihikisakiMainService.save(BeanUtil.copyProperties(command.torihikisakiMainDTO(), TorihikisakiMain.class));
        torihikisakiTantouService.saveBatch(BeanUtil.copyToList(command.torihikisakiTantouDTO(), TorihikisakiTantou.class));
    }
}
