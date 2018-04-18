package com.hyb.sep.chapter04.section05.p01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanLifeCycleDemo {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("chapter04/bean-life-cycle.xml");
        BeanFactory bf = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((DefaultListableBeanFactory)bf);
        reader.loadBeanDefinitions(resource);

        ((DefaultListableBeanFactory) bf).addBeanPostProcessor(new MyBeanPostProcessor());
        ((DefaultListableBeanFactory) bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        BeanFactoryCar car1 = (BeanFactoryCar) bf.getBean("car");
        System.out.println(car1);
        car1.setColor("red");
        BeanFactoryCar car2 = (BeanFactoryCar) bf.getBean("car");
        System.out.println("car1==car2:"+(car1==car2));
        ((DefaultListableBeanFactory) bf).destroySingletons();
    }
}
