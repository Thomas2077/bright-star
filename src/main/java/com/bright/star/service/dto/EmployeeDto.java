package com.bright.star.service.dto;

import com.bright.star.controller.vo.value.BaseInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description社員_info_dto
 **/
@ApiModel(value = "worker dto object", description = "社員_info_dto")
public record EmployeeDto(
        SyainMainDTO syainMainDTO,
        List<SyainRirekiDTO> syainRirekiDTOList,
        List<SyainKeirekiDTO> businessExperienceDTOList
){

}
