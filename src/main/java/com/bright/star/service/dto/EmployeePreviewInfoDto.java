package com.bright.star.service.dto;

import cn.hutool.core.util.StrUtil;
import com.bright.star.infrastructure.persistence.entity.SyainMain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "worker preview object", description = "社員管理画面 dto")
public class EmployeePreviewInfoDto {

    @ApiModelProperty("社員番号")
    private Integer workerId;

    @ApiModelProperty("所属会社")
    private String companyName;

    @ApiModelProperty("社員名")
    private String workerName;

    @ApiModelProperty("性別")
    private Integer gender;

    @ApiModelProperty("職業種類")
    private Integer jobCategoryId;

    @ApiModelProperty("職業種類")
    private String jobCategory;

    @ApiModelProperty("入社日")
    private LocalDate onBoardDate;

    @ApiModelProperty("退社日")
    private LocalDate offBoardDate;

    public static EmployeePreviewInfoDto build(SyainMain main){
           return EmployeePreviewInfoDto.builder()
                    .workerId(main.getSyainId())
                    .workerName(StrUtil.concat(true, main.getFirstNameKanji(), main.getLastNameKanji()))
                    .gender(main.getSeibetu())
                    .jobCategoryId(main.getSyokugyoKind())
                    .onBoardDate(main.getNyuusyaDate())
                    .offBoardDate(main.getTaisyaDate())
                    .build();

    }
}
