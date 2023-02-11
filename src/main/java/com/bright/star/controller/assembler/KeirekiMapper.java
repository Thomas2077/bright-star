package com.bright.star.controller.assembler;

import com.bright.star.infrastructure.common.BeanTools;
import com.bright.star.infrastructure.persistence.entity.SyainKeireki;
import com.bright.star.service.dto.SyainKeirekiDTO;

import java.util.function.Function;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/10
 * @description
 **/
public class KeirekiMapper implements Function<SyainKeirekiDTO, SyainKeireki> {
    @Override
    public SyainKeireki apply(SyainKeirekiDTO syainKeirekiDTO) {
        return BeanTools.copyProperties(syainKeirekiDTO, new SyainKeireki());
    }
}
