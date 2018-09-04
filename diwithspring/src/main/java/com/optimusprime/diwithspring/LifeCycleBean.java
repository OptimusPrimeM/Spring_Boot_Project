package com.optimusprime.diwithspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBean implements InitializingBean, DisposableBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware {

    public LifeCycleBean() {
        System.out.println("##Im in lifecycle bean constructor.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("##Life cycle bean hsa been its property set!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("##Life cycle bean hsa been terminated!");
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("##Life cycle name is "+ beanName);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("##Bean factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("##Applcation context has been set");
    }

    @PostConstruct
    public void postConstruction(){
        System.out.println("##Post construct annotated method has been called!");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("##Pre destroy annotated method has been called!");
    }
   public void beforeInit(){
       System.out.println("Before init called by bean post processor!");
   }

    public void aftreInit(){
        System.out.println("##After init called by bean post processor!");
    }
}

