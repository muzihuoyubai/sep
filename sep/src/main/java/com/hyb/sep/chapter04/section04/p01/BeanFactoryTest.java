package com.hyb.sep.chapter04.section04.p01;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * BeanFactory 生产bean
 */
public class BeanFactoryTest {
    public static void main(String[] args) throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:chapter04/beandemo.xml");
        System.out.println(resource.getURL());
        //不推荐
//        BeanFactory bf = new XmlBeanFactory(resource);
//        Car car = (Car)bf.getBean("car");
//        System.out.println(car);

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
        Car car = factory.getBean("car", Car.class);
        System.out.println(car);
    }
}
