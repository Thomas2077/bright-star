package com.bright.star.controller.command;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;


/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description 社員管理画面検索 command
 **/
@Schema(description = "社員管理画面検索 command")
public record EmployeeQueryCommand(
        @Schema(description = "所属会社Id")
        Integer companyId,

        @Schema(description = "社員名")
        String workerName,

        @Schema(description = "職業種類-ID")
        Integer jobCategoryId,

        @Schema(description = "在職/非在職")
        @NotNull
        Boolean onDuty,

        @Schema(description = "在職/非在職")
        Integer syainId
){
}
