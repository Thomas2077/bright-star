package com.bright.star.service.dto;

import com.bright.star.service.dto.value.BaseInfo;
import com.bright.star.service.dto.value.BusinessExperienceInfo;
import com.bright.star.service.dto.value.JobExperience;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description社員_info_dto
 **/
@Data
@Accessors(chain = true)
@ApiModel(value = "worker dto object", description = "社員_info_dto")
public class EmployeeDto {

    @ApiModelProperty(value = "BaseInfo")
    private BaseInfo baseInfo;

    @ApiModelProperty("業務経歴")
    private List<BusinessExperienceInfo> businessExperienceInfoList;

    @ApiModelProperty("職歴情報")
    private List<JobExperience> jobExperienceList;

}
