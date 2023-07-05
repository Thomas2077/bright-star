package com.bright.star.controller.command;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/11
 * @description
 **/
@Schema(description = "取引先画面検索 command")
public record ConsumerQueryCommand(

        @Schema(description = "取引先名", example = "consumerName")
        String consumerName,

        @Schema(description = "取引元名", example = "consumerAddress")
        String consumerAddress

) {
}
