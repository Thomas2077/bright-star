package com.bright.star.service.dto;

import cn.hutool.core.util.StrUtil;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description TODO
 **/
@Data
@Builder
@Accessors(chain = true)
@Schema(description = "worker preview object")
public
class EmployeePreviewInfoDto {

    @Schema(description = "社員番号")
    private Integer workerId;

    @Schema(description = "所属会社")
    private String companyName;

    @Schema(description = "社員名")
    private String workerName;

    @Schema(description = "性別")
    private Integer gender;

    @Schema(description = "職業種類")
    private Integer jobCategoryId;

    @Schema(description = "職業種類")
    private String jobCategory;

    @Schema(description = "入社日")
    private LocalDate onBoardDate;

    @Schema(description = "退社日")
    private LocalDate offBoardDate;

    public static EmployeePreviewInfoDto build(SyainMainDTO main) {
        return EmployeePreviewInfoDto.builder()
                .workerId(main.syainId())
                .workerName(StrUtil.concat(true, main.firstNameKanji(), main.lastNameKanji()))
                .gender(main.seibetu())
                .jobCategoryId(main.syokugyoKind())
                .onBoardDate(main.nyuusyaDate())
                .offBoardDate(main.taisyaDate())
                .build();

    }
}
