package com.bright.star.service.app;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.stereotype.Service;
import com.bright.star.infrastructure.persistence.entity.TorihikisakiTantou;
import com.bright.star.infrastructure.persistence.dao.TorihikisakiTantouDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
* <p>
    *  服务类
    * </p>
*
* @since 2023-02-02
*/
@Service
public class TorihikisakiTantouService extends  ServiceImpl<TorihikisakiTantouDao, TorihikisakiTantou> {

    public TorihikisakiTantou getByTorihikisaki(Integer id) {
        LambdaQueryWrapper<TorihikisakiTantou> condition =
                new LambdaQueryWrapper<TorihikisakiTantou>().eq(TorihikisakiTantou::getTorihikiId, id);
         return getOne(condition);
    }

}
