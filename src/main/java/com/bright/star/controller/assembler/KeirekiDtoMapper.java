package com.bright.star.controller.assembler;

import cn.hutool.core.bean.BeanUtil;
import com.bright.star.infrastructure.persistence.entity.SyainKeireki;
import com.bright.star.service.dto.SyainKeirekiDTO;

import java.util.function.Function;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/10
 * @description
 **/
public class KeirekiDtoMapper implements Function<SyainKeireki, SyainKeirekiDTO>{

    @Override
    public SyainKeirekiDTO apply(SyainKeireki syainKeireki) {
        return BeanUtil.copyProperties(syainKeireki, SyainKeirekiDTO.class);
    }
}
