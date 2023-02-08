package com.bright.star.controller.vo;

import com.bright.star.controller.vo.value.BaseInfo;
import com.bright.star.controller.vo.value.SyainKeirekiInfo;
import com.bright.star.controller.vo.value.SyainRirekiInfo;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "worker preview object")
public
class EmployeeVO {

    private BaseInfo baseInfo;

    private SyainKeirekiInfo syainKeirekiInfo;

    private SyainRirekiInfo syainRirekiInfo;
}
