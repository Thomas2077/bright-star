package com.bright.star.service.app;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.stereotype.Service;
import com.bright.star.infrastructure.persistence.entity.SyainRireki;
import com.bright.star.infrastructure.persistence.dao.SyainRirekiDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.time.LocalDate;
import java.util.List;

/**
* <p>
    * 社員_経費 服务类
    * </p>
*
* @since 2023-02-02
*/
@Service
public class SyainRirekiService extends  ServiceImpl<SyainRirekiDao, SyainRireki> {

    public List<SyainRireki> queryByIdAndStart(Integer syainId, LocalDate kaisibi){
        LambdaQueryWrapper<SyainRireki> condition = new LambdaQueryWrapper<SyainRireki>()
                .eq(SyainRireki::getSyainId, syainId)
                .eq(SyainRireki::getKaisibi, kaisibi);
        return this.list(condition);
    }


    public List<SyainRireki> queryById(Integer syainId){
        LambdaQueryWrapper<SyainRireki> condition = new LambdaQueryWrapper<SyainRireki>()
                .eq(SyainRireki::getSyainId, syainId);
        return this.list(condition);
    }

}
