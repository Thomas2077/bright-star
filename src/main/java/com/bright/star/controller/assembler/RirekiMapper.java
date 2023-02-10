package com.bright.star.controller.assembler;

import cn.hutool.core.bean.BeanUtil;
import com.bright.star.infrastructure.persistence.entity.SyainRireki;
import com.bright.star.service.dto.SyainRirekiDTO;

import java.util.function.Function;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/10
 * @description
 **/
public class RirekiMapper implements Function<SyainRirekiDTO, SyainRireki>{

    @Override
    public SyainRireki apply(SyainRirekiDTO syainRirekiDTO) {
        return BeanUtil.copyProperties(syainRirekiDTO, SyainRireki.class);
    }
}
