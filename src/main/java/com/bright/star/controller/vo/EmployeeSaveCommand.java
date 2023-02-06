package com.bright.star.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/6
 * @description
 **/
@Data
@Accessors(chain = true)
@ApiModel(value = "worker save object", description = "社員登録 vo")
public class EmployeeSaveCommand {

    @ApiModelProperty("社員番号")
    private Integer workerId;

    @ApiModelProperty("所属会社")
    private String companyName;

    @ApiModelProperty("社員名")
    private String workerName;

    @ApiModelProperty("性別str")
    private String genderStr;

    @ApiModelProperty("性別")
    private String gender;

    @ApiModelProperty("職業種類-ID")
    private Integer jobCategoryId;

    @ApiModelProperty("職業種類")
    private String jobCategory;

    @ApiModelProperty("入社日")
    private LocalDate onBoardDate;

    @ApiModelProperty("退社日")
    private LocalDate offBoardDate;
}
