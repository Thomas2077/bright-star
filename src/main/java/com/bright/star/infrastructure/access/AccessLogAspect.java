package com.bright.star.infrastructure.access;

import com.bright.star.infrastructure.persistence.entity.UserAccessLog;
import com.bright.star.service.app.UserAccessLogService;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/12
 * @description
 **/
@Aspect
@Component
@RequiredArgsConstructor
public class AccessLogAspect {
    private final UserAccessLogService userAccessLogService;

    @Pointcut("@annotation(com.bright.star.infrastructure.access.AccessLog)")
    public void accessLog() {

    }

    @Before(value = "accessLog()")
    public void doBefore() {

        userAccessLogService.save(new UserAccessLog());
    }
}
