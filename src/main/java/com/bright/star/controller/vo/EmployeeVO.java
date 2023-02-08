package com.bright.star.controller.vo;

import com.bright.star.controller.vo.value.BaseInfo;
import com.bright.star.controller.vo.value.SyainKeirekiInfo;
import com.bright.star.controller.vo.value.SyainRirekiInfo;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/8
 * @description
 **/
@Data
@Builder
@ApiModel(value = "worker preview object", description = "社員管理画面 vo")
public class EmployeeVO {

    private BaseInfo baseInfo;

    private SyainKeirekiInfo syainKeirekiInfo;

    private SyainRirekiInfo syainRirekiInfo;
}
