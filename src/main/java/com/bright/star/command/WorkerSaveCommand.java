package com.bright.star.command;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;


/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/3
 * @description TODO
 **/
@ApiModel(value = "WorkerSaveCommand")
public record WorkerSaveCommand(
        @NotNull
        @ApiModelProperty(value = "社員コード")
        Integer syainId,

        @NotNull
        @ApiModelProperty
        String firstNameKanji,
         String lastNameKanji,
        @ApiModelProperty(value = "社員名（カタカナ）＿姓")
        String firstNameKana
) {
}
