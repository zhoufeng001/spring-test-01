package com.spring.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class ZFMethodAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("method before ... " + method.getName());
    }

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("method after ... " + method.getName());
    }

    public void afterThrowing(Exception e) {
        System.out.println("afterThrowing:" + e.getMessage());
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.out.println("afterThrowing:" + e.getMessage());
    }

    // 该方法可以重载，根据异常类型的不同
    public void afterThrowing(Method method, Object[] args, Object target, NullPointerException e) {
        System.out.println("afterThrowing:空指针");
    }

}
