package com.bright.star.controller.command;

import com.bright.star.service.dto.SyainKeirekiDTO;
import com.bright.star.service.dto.SyainMainDTO;
import com.bright.star.service.dto.SyainRirekiDTO;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;


/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/6
 * @description
 **/
@Schema(name = "社員save command", description = "社員save command")
public record EmployeeSaveCommand (
        @Schema(description = "syainMain object ") SyainMainDTO syainMainDTO,
        @Schema(description = "rireki ") List<SyainRirekiDTO> syainRirekiDTOList,
        @Schema(description = "Keireki") List<SyainKeirekiDTO> syainKeirekiDTOList
){


}
