package com.huangshi.wuji.spring.scaffold.designpattern.dynamicproxy;

import com.huangshi.wuji.spring.scaffold.designpattern.dynamicproxy.businessInterface.Car;
import com.huangshi.wuji.spring.scaffold.designpattern.dynamicproxy.businessInterface.Vehicle;
import com.huangshi.wuji.spring.scaffold.designpattern.dynamicproxy.handler.JDKDynamicProxy;

public class Client {

    public static void main(String[] args) {
        Car carTarget = new Car();

        //根据目标对象carTarget生成代理
        JDKDynamicProxy proxy = new JDKDynamicProxy(carTarget);

        // JDK 动态代理是基于接口的，根据代理进一步生成基于接口的代理对象
        Vehicle carProxy = proxy.getProxy();

        //调用代理对象的方法
        carProxy.run();
    }
}
