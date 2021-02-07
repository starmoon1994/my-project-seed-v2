package com.company.project.support.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 自定义日志切面
 */
@Aspect
@Component
public class LogAspect {
    private final static String TRACE_ID = "traceId";

//    /**
//     * 自定义切点 按注解
//     */
//    @Pointcut("@annotation(com.company.project.support.aop.LogId)")
//    public void pointCut() {
//    }

    /**
     * 自定义切点
     * public * *(..)  任何公共执行的方法
     * https://blog.csdn.net/qq_36951116/article/details/79172485
     */
    @Pointcut("execution(public * com.company.project.service..*.*(..))")
    public void pointCut() {
    }

    @Pointcut("execution(* com.company.project.controller.*.*(..))")
    public void pointCut2() {
    }

    /**
     * 前置通知-记录请求信息
     *
     * @param joinPoint
     */
    @Before("pointCut() || pointCut2()")
    public void doBeforeAdvice(JoinPoint joinPoint) {
        // MDC容器增加requestId
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        MDC.put(TRACE_ID, uuid);


    }

    /**
     * 后置通知-记录返回信息
     *
     * @param joinPoint
     * @param result
     */
    @AfterReturning(pointcut = "pointCut()", returning = "result")
    public void doAfterReturningAdvice(JoinPoint joinPoint, Object result) {

        MDC.remove(TRACE_ID);
    }

    /**
     * 后置异常通知-记录返回出现异
     *
     * @param joinPoint
     * @param exception
     */
    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void doAfterThrowingAdvice(JoinPoint joinPoint, Throwable exception) {

        MDC.remove(TRACE_ID);
    }

}