package com.huangshi.wuji.spring.scaffold.designpattern.dynamicproxy.businessInterface;

public class Car implements Vehicle {

    @Override
    public void run() {
        System.out.println("Car is a vehicle running on the road");
    }
}
