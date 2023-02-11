package com.bright.star.controller.command;

import com.bright.star.service.dto.TorihikisakiMainDTO;
import com.bright.star.service.dto.TorihikisakiTantouDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.util.List;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/11
 * @description
 **/
@Schema(description = "Customer")
public record CustomerSaveCommand(
        @NotNull
        @Schema(description = "取引先情報", required = true)
        TorihikisakiMainDTO torihikisakiMainDTO,

        @Schema(description = "取引先担当者", required = false)
        List<TorihikisakiTantouDTO> torihikisakiTantouDTO
) {
}
