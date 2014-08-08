package com.spring.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

import com.spring.service.PersonService;

public class PersonServiceImpl implements PersonService, ApplicationContextAware, MessageSourceAware, BeanFactoryAware, BeanNameAware, ApplicationEventPublisherAware, ResourceLoaderAware {

    private String                    name;

    private ResourceLoader            resourceLoader;

    private ApplicationEventPublisher applicationEventPublisher;

    private String                    beanName;

    private BeanFactory               beanFactory;

    private MessageSource             messageSource;

    private ApplicationContext        applicationContext;

    public void sayHello() {
        System.out.println("Hello World!");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
