package com.hyb.sep.chapter04.section04.p02;

import com.hyb.sep.chapter04.section04.p01.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.beans.Beans;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter04/beandemo.xml");
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car);

        //注解的方式创建bean
        ApplicationContext ctxAnnotation = new AnnotationConfigApplicationContext(Beans.class);
        Car carAnnotation = ctx.getBean("car",Car.class);
        System.out.println(car);

    }
}
