package com.bright.star.controller.vo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.bright.star.service.dto.EmployeePreviewInfoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.val;

import java.time.LocalDate;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description 社員管理画面 View Object
 **/
@Data
@Schema(description = "worker preview object")
public
class EmployeePreviewInfoVO {


    @Schema(description = "社員番号")
    private Integer workerId;

    @Schema(description = "所属会社")
    private String companyName;

    @Schema(description = "社員名")
    private String workerName;

    @Schema(description = "性別")
    private String genderStr;

    @Schema(description = "職業種類-ID")
    private Integer jobCategoryId;

    @Schema(description = "職業種類")
    private String jobCategory;

    @Schema(description = "入社日")
    private LocalDate onBoardDate;

    @Schema(description = "退社日")
    private LocalDate offBoardDate;

    public static EmployeePreviewInfoVO build(EmployeePreviewInfoDto dto) {
        val employeePreviewInfoVO = BeanUtil.copyProperties(dto, EmployeePreviewInfoVO.class);
        // 0:女 1:男
        employeePreviewInfoVO.setGenderStr(dto.getGender() == 1 ? "男" : "女");
        return employeePreviewInfoVO;
    }
}
