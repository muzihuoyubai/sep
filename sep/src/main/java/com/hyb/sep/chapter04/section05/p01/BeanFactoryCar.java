package com.hyb.sep.chapter04.section05.p01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactoryCar implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private static final Logger LOG = LogManager.getLogger(BeanFactoryCar.class.getName());
    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    @Bean(name = "beanFactoryCar", initMethod = "carInit", destroyMethod = "carDestroy")
    public BeanFactoryCar buildCar() {
        LOG.debug("buildCar::");
        BeanFactoryCar car = new BeanFactoryCar();
        car.setColor("blue");
        car.setMaxSpeed(300);
        return car;
    }

    public BeanFactoryCar() {
        LOG.debug("BeanFactoryCar::");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "BeanFactoryCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", beanFactory=" + beanFactory +
                ", beanName='" + beanName + '\'' +
                '}';
    }

    // 2 BeanFactoryAware 接口方法
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        LOG.debug("setBeanFactory::beanFactory = [{}]", beanFactory);
    }

    // 3 BeanNameAware 接口方法
    public void setBeanName(String s) {
        LOG.debug("setBeanName::s = [{}]", s);
        LOG.debug("setBeanName::s = [{}]", s);
    }

    // 5 DisposableBean 接口
    public void destroy() throws Exception {
        LOG.debug("destroy::");
    }

    // 4 InitializingBean 接口
    public void afterPropertiesSet() throws Exception {
        LOG.debug("afterPropertiesSet::");
    }

    public void carInit() {
        LOG.debug("carInit::");
    }

    public void carDestroy() {
        LOG.debug("carDestroy::");
    }

}
