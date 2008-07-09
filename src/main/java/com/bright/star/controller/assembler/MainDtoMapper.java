package com.bright.star.controller.assembler;

import cn.hutool.core.bean.BeanUtil;
import com.bright.star.infrastructure.persistence.entity.SyainMain;
import com.bright.star.service.dto.SyainMainDTO;
import java.util.function.Function;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/10
 * @description
 **/
public class MainDtoMapper implements Function<SyainMain, SyainMainDTO>{
    @Override
    public SyainMainDTO apply(SyainMain syainMain) {
        return BeanUtil.copyProperties(syainMain, SyainMainDTO.class);
    }
}
