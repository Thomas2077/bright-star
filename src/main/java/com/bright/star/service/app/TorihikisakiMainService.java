package com.bright.star.service.app;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.bright.star.controller.command.ConsumerQueryCommand;
import org.springframework.stereotype.Service;
import com.bright.star.infrastructure.persistence.entity.TorihikisakiMain;
import com.bright.star.infrastructure.persistence.dao.TorihikisakiMainDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
* <p>
    *  服务类
    * </p>
*
* @since 2023-02-02
*/
@Service
public class TorihikisakiMainService extends  ServiceImpl<TorihikisakiMainDao, TorihikisakiMain> {

    public List<TorihikisakiMain> queryByCondition(ConsumerQueryCommand command) {
        LambdaQueryWrapper<TorihikisakiMain> query = new LambdaQueryWrapper<>();
        query.like(StrUtil.isNotEmpty(command.consumerName()), TorihikisakiMain::getTorihikiNameAll, command.consumerName());
        query.eq(StrUtil.isNotEmpty(command.consumerAddress()), TorihikisakiMain::getFax, command.consumerAddress());
        query.orderBy(true,true, TorihikisakiMain::getTorihikiId);
        return list(query);
    }
}
