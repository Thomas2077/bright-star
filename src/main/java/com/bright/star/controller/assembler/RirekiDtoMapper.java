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
public class RirekiDtoMapper implements Function<SyainRireki, SyainRirekiDTO> {

    @Override
    public SyainRirekiDTO apply(SyainRireki syainRireki) {
        return BeanUtil.copyProperties(syainRireki, SyainRirekiDTO.class);
    }
}
