package com.bright.star.controller.command;

import io.swagger.v3.oas.annotations.media.Schema;


/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/6
 * @description
 **/
@Schema(name = "社員save command", description = "社員save command")
public record EmployeeSaveCommand (@Schema(description = "wadaws ") Integer main){


}
