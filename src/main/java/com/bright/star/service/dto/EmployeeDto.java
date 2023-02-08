package com.bright.star.service.dto;

import com.bright.star.controller.vo.value.BaseInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description社員_info_dto
 **/
@Schema(description = "worker dto object")
public
record EmployeeDto(
        SyainMainDTO syainMainDTO,
        List<SyainRirekiDTO> syainRirekiDTOList,
        List<SyainKeirekiDTO> businessExperienceDTOList
) {
}
