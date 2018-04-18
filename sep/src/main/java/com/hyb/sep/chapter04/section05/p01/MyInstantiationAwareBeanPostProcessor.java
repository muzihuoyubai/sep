package com.hyb.sep.chapter04.section05.p01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;


public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    private static final Logger LOG = LogManager.getLogger(MyInstantiationAwareBeanPostProcessor.class.getName());

    //实例化对象后调用
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        LOG.debug("postProcessAfterInstantiation::bean = [{}], beanName = [{}]", bean, beanName);
        return super.postProcessAfterInstantiation(bean, beanName);
    }

    // 实例化对象前调用
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        LOG.debug("postProcessBeforeInstantiation::beanClass = [{}], beanName = [{}]",beanClass, beanName);
        return super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    // 属性初始化前调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOG.debug("postProcessBeforeInitialization::bean = [{}], beanName = [{}]",bean, beanName);
        return super.postProcessBeforeInitialization(bean, beanName);
    }

    // 设置属性前调用
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        LOG.debug("postProcessPropertyValues::pvs = [{}], pds = [{}], bean = [{}], beanName = [{}]",pvs, pds, bean, beanName);
        return super.postProcessPropertyValues(pvs, pds, bean, beanName);
    }
}
