package com.bright.star.controller.command;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description 社員管理画面検索 command
 **/
@Data
@ApiModel(value = "社員管理画面検索 command", description = "社員管理画面検索 command")
public class EmployeeQueryCommand {
        @ApiModelProperty("所属会社Id")
        private Integer companyId;

        @ApiModelProperty("社員名")
        private String workerName;

        @ApiModelProperty("職業種類-ID")
        private Integer jobCategoryId;

        @NotNull
        @ApiModelProperty("在職/非在職")
        private boolean onDuty;

}
