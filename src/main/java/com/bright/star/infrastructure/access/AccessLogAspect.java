package com.bright.star.infrastructure.access;

import com.bright.star.infrastructure.auth.Role;
import com.bright.star.infrastructure.persistence.entity.UserAccessLog;
import com.bright.star.service.app.UserAccessLogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.time.LocalDateTime;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/12
 * @description
 **/
@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class AccessLogAspect {
    private final UserAccessLogService userAccessLogService;

    @Pointcut("@annotation(com.bright.star.infrastructure.access.AccessLog)")
    public void accessLog() {

    }

    @Before(value = "accessLog()")
    public void doBefore(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        var method = signature.getMethod();
        AccessLog annotation = method.getAnnotation(AccessLog.class);
        log.info("annotation.pageId() :{}", annotation.pageId());
        log.info("annotation.test id() :{}", annotation.testId());

        StandardEvaluationContext context = new StandardEvaluationContext();

        // Map function parameters to their names
        for (int i = 0; i < signature.getParameterNames().length; i++) {
            context.setVariable(signature.getParameterNames()[i], args[i]);
        }

        // Parse and evaluate the SpEL expression
        ExpressionParser parser = new SpelExpressionParser();
        String spelExpressionResult = parser.parseExpression(annotation.pageId()).getValue(context, String.class);

        System.out.println("SpEL 表达式结果: " + spelExpressionResult);

        UserAccessLog userAccessLog = new UserAccessLog();
        userAccessLog.setUserId(1);
        userAccessLog.setGamenId("gamenUd");
        userAccessLog.setStartTime(LocalDateTime.now());
        userAccessLogService.save(userAccessLog);
    }
}
