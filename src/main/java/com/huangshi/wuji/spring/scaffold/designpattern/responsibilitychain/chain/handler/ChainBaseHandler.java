package com.huangshi.wuji.spring.scaffold.designpattern.responsibilitychain.chain.handler;

import com.huangshi.wuji.spring.scaffold.designpattern.responsibilitychain.chain.Chain;

public abstract class ChainBaseHandler {

    public void execute(Chain chain){
        handlerProcess();
        chain.proceed();
    }

    //业务逻辑方法
    protected abstract void handlerProcess();

}
