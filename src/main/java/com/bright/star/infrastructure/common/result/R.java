package com.bright.star.infrastructure.common.result;

import com.bright.star.infrastructure.common.PageResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回结果
 * @author zyj
 * @since 2021-06-01
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "返回结果对象", description = "返回结果")
public class R<T> {

    /**
     * 业务状态码
     */
    @ApiModelProperty(value = "业务状态码")
    private Integer code;

    /**
     * 消息
     */
    @ApiModelProperty(value = "消息信息")
    private String message;

    /**
     * 数据
     */
    @ApiModelProperty(value = "数据")
    private T data;

    public static R success() {
        return R.builder().code(HttpStatus.OK.value()).message("").build();
    }

    public static R success(Object data) {
        return R.builder().code(HttpStatus.OK.value()).message("").data(data).build();
    }

    /**
     * 返回结果带分页数据
     * @param pageR
     * @return
     */
    public static R success(PageResult pageR) {
        Map<String, Object> RMap = new HashMap<>(16);
        RMap.put("list", pageR.getRows());
        RMap.put("total", pageR.getTotal());
        return R.builder().code(HttpStatus.OK.value()).message("").data(RMap).build();
    }

    /**
     * 返回结果带分页数据
     * @param pageR
     * @return
     */
    public static R pageSuccess(PageResult pageR) {

        return R.builder().code(HttpStatus.OK.value()).message("").data(pageR).build();
    }

    public static R fail(Integer code, String message) {
        return R.builder().code(code).message(message).build();
    }

    public static R fail(HttpStatus httpStatus) {
        return R.builder().code(httpStatus.value()).message(httpStatus.getReasonPhrase()).build();
    }

    public static R failed(String message) {
        return R.builder().message(message).code(HttpStatus.INTERNAL_SERVER_ERROR.value()).build();
    }

    public static Object failed(ResultCode resultCode) {
        return R.builder().message(resultCode.getCode() + ":" + resultCode.getMsg()).build();
    }
}
