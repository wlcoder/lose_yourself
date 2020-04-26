package com.wl.loseyourself.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 *  @author: wl
 *  @Date: 2020/4/26 11:02
 *  @Description: 打印方法运行时间
 */
@Aspect
@Component
@Slf4j
public class TimeConsumeAspect {

    @Pointcut("@annotation(com.wl.loseyourself.aop.TimeConsumeAnnotation)")
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object proceed = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        log.info("[方法耗时]" + methodSignature.getDeclaringTypeName() + "." + methodSignature.getMethod().getName() + " 耗时: " + (endTime - startTime) + "毫秒");
        return proceed;
    }

}
