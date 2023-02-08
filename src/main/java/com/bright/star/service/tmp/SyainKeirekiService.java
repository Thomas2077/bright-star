package com.bright.star.service.tmp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.stereotype.Service;
import com.bright.star.infrastructure.persistence.entity.SyainKeireki;
import com.bright.star.infrastructure.persistence.dao.SyainKeirekiDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
* <p>
    * 社員マスタ_経歴 服务类
    * </p>
*
* @since 2023-02-02
*/
@Service
public class SyainKeirekiService extends  ServiceImpl<SyainKeirekiDao, SyainKeireki> {

    public List<SyainKeireki> queryById(Integer id){
        LambdaQueryWrapper<SyainKeireki> condition = new LambdaQueryWrapper<SyainKeireki>().eq(SyainKeireki::getSyainId, id);
        return list(condition);
    }
}
