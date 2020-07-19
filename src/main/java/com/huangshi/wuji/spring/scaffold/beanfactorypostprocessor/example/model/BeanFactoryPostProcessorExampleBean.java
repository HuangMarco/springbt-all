package com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example.model;

public class BeanFactoryPostProcessorExampleBean {

    private String strProp;

    public void setStrProp (String strProp) {
        this.strProp = strProp;
    }

    public void doSomething () {
        System.out.println("from MyBean:  " + strProp);
    }

}
