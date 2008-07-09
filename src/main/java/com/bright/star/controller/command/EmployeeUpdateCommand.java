package com.bright.star.controller.command;

import com.bright.star.service.dto.SyainKeirekiDTO;
import com.bright.star.service.dto.SyainMainDTO;
import com.bright.star.service.dto.SyainRirekiDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.util.List;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/5
 * @description
 **/
@Schema(description = "社員更新 command")
public record EmployeeUpdateCommand (

        @NotNull @Schema(description = "syainMain object ") SyainMainDTO syainMainDTO,
        @Schema(description = "rireki ") List<SyainRirekiDTO> syainRirekiDTOList,
        @Schema(description = "Keireki") List<SyainKeirekiDTO> syainKeirekiDTOList
){



}
