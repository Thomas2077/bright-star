package com.bright.star.controller.command;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description 社員管理画面検索 command
 **/
@Data
@Schema(description = "社員管理画面検索 command")
public
class EmployeeQueryCommand {
    @Schema(description = "所属会社Id")
    private Integer companyId;

    @Schema(description = "社員名")
    private String workerName;

    @Schema(description = "職業種類-ID")
    private Integer jobCategoryId;

    @NotNull
    @Schema(description = "在職/非在職")
    private boolean onDuty;

    @Schema(description = "在職/非在職")
    private Integer syainId;

}
