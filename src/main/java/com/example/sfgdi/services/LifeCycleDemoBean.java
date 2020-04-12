package com.example.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, DisposableBean {

    @Override
    public void setBeanName(String name) {
        System.out.println("## Bean name set to: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory is set!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application Context is set!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## Properties are set!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## Bean is destroyed!");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## Post construct method is executed!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## Pre destroy method is executed!");
    }
}
