package com.bright.star.controller.assembler;

import com.bright.star.infrastructure.common.BeanTools;
import com.bright.star.infrastructure.persistence.entity.SyainMain;
import com.bright.star.service.dto.SyainMainDTO;

import java.util.function.Function;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/10
 * @description
 **/
public class MainMapper implements Function<SyainMainDTO, SyainMain>{
    @Override
    public SyainMain apply(SyainMainDTO syainMainDTO) {
        return BeanTools.copyProperties(syainMainDTO, new SyainMain());
    }
}
