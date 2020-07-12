package com.huangshi.wuji.spring.scaffold.designpattern.dynamicproxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler {

    //被代理对象，也被称为目标对象
    //在动态代理中，最重要的就是目标对象获取被代理对象的引用，就是引用复制过来
    private Object target;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 回调方法
     * @param proxy JDK负责生成的代理对象
     * @param method 被代理的方法（也就是需要增强的方法,也是你AOP切面要应用到的方法）
     * @param args  被代理方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("在调用目标对象方法之前，执行一些业务逻辑");
        Object object = method.invoke(target, args);
        System.out.println("在调用目标对象方法之后，执行一些业务逻辑");
        return object;
    }


    /**
     * 针对一个特定接口的invoke方法返回一个Proxy的实例，即返回一个代理对象，该代理对象实现了target对象相同的所有接口
     * @param 第一个参数，设置为同一个加载JDKDynamicProxy的Class Loader，即设置相同的class loader
     * @param 第二个参数，点击getInferfaces()就会发现最终进入到Class.getInterfaces()，在这个地方，是目标对象的所有的接口
     * @param 第三个参数，把自己传递进去，即JDKDynamicProxy
     **/
    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
