package com.bright.star.infrastructure.exception;

import com.bright.star.infrastructure.common.result.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.sql.SQLException;
import java.util.Set;

/**
 * 异常通用处理
 */
@ControllerAdvice
@ResponseBody
@Slf4j
public class DefaultExceptionAdvice {

    /**
     * 捕获参数检验异常
     *
     * @param e
     * @param response
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public R methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e,
                                                    HttpServletResponse response) {
        // 设置http状态码为400
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        if (e.getBindingResult().hasFieldErrors()) {
            StringBuilder res = new StringBuilder();
            e.getBindingResult().getFieldErrors().stream().forEach(error->{
                res.append(error.getField() + error.getDefaultMessage() + ";");
            });
            return R.fail(HttpStatus.BAD_REQUEST.value(), res.toString());
        }
        return R.fail(HttpStatus.BAD_REQUEST.value(), e.getLocalizedMessage());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public R constraintViolationException(ConstraintViolationException e, HttpServletResponse response) {
        // 设置http状态码为400
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
        StringBuilder builder = new StringBuilder();
        for (ConstraintViolation violation : violations) {
            builder.append(violation.getMessage());
            break;
        }
        return R.fail(HttpStatus.BAD_REQUEST.value(), builder.toString());
    }

    /**
     * IllegalArgumentException异常处理返回json
     * 返回状态码:400
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({IllegalArgumentException.class})
    public R badRequestException(IllegalArgumentException e) {
        return defHandler("参数解析失败", e);
    }

    /**
     * IllegalArgumentException异常处理返回json
     * 返回状态码:400
     */
//    @ResponseStatus(HttpStatus.FORBIDDEN)
//    @ExceptionHandler({InternalAuthenticationServiceException.class})
//    public R internalAuthenticationServiceException(IllegalArgumentException e) {
//        return defHandler("认证失败", e);
//    }

    /**
     * AccessDeniedException异常处理返回json
     * 返回状态码:403
     */
//    @ResponseStatus(HttpStatus.FORBIDDEN)
//    @ExceptionHandler({AccessDeniedException.class})
//    public R badMethodExpressException(AccessDeniedException e) {
//        return defHandler("没有权限请求当前方法", e);
//    }

    /**
     * 返回状态码:405
     */
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public R handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return defHandler("不支持当前请求方法", e);
    }

    /**
     * 返回状态码:415
     */
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    @ExceptionHandler({HttpMediaTypeNotSupportedException.class})
    public R handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
        return defHandler("不支持当前媒体类型", e);
    }

    /**
     * SQLException sql异常处理
     * 返回状态码:500
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({SQLException.class})
    public R handleSQLException(SQLException e) {
        return defHandler("服务运行SQLException异常", e);
    }

    /**
     * BusinessException 业务异常处理
     * 返回状态码:500
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(BusinessException.class)
    public R handleException(BusinessException e) {
        return defHandler(e.getMessage(), e);
    }

    /**
     * IdempotencyException 幂等性异常
     * 返回状态码:200
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(IdempotencyException.class)
    public R handleException(IdempotencyException e) {
        return R.failed(e.getMessage());
    }

    /**
     * 所有异常统一处理
     * 返回状态码:500
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        return defHandler("未知异常", e);
    }

    private R defHandler(String msg, Exception e) {
        log.error(msg, e);
        return R.failed(msg);
    }


}
