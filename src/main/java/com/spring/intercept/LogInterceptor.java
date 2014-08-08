package com.spring.intercept;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogInterceptor implements MethodBeforeAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.printf("method call before...\n");

    }
}
