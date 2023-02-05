package com.bright.star.controller.vo;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.bright.star.service.dto.EmployeePreviewInfoDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@Accessors(chain = true)
@ApiModel(value = "worker preview object", description = "社員管理画面 vo")
public class EmployeePreviewInfoVO{


        @ApiModelProperty("社員番号")
        private Integer workerId;

        @ApiModelProperty("所属会社")
        private String companyName;

        @ApiModelProperty("社員名")
        private String workerName;

        @ApiModelProperty("性別")
        private String genderStr;

        @ApiModelProperty("職業種類-ID")
        private Integer jobCategoryId;

        @ApiModelProperty("職業種類")
        private String jobCategory;

        @ApiModelProperty("入社日")
        private LocalDate onBoardDate;

        @ApiModelProperty("退社日")
        private LocalDate offBoardDate;

        public static EmployeePreviewInfoVO build(EmployeePreviewInfoDto dto){
                val employeePreviewInfoVO = BeanUtil.copyProperties(dto, EmployeePreviewInfoVO.class);
                // 0:女 1:男
                employeePreviewInfoVO.setGenderStr(dto.getGender() == 1 ? "男" : "女");
                return employeePreviewInfoVO;
        }
}
