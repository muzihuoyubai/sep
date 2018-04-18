package com.hyb.sep.chapter04.section04.p01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {
    private String brand;
    private String color;
    private String maxSpeed;

    public Car() {
        super();
    }

    @Bean(name="car")
    public Car buildCar(){
        Car car = new Car();
        car.setBrand("兰博基尼");
        car.setMaxSpeed("500");
        return car;
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

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}
