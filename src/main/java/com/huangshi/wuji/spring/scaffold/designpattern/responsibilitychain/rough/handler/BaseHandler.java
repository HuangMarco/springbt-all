package com.huangshi.wuji.spring.scaffold.designpattern.responsibilitychain.rough.handler;

public abstract class BaseHandler {

    //储存下一个handler
    private BaseHandler nextHandler;

    public BaseHandler() {}

    public BaseHandler(BaseHandler handler) {
        this.nextHandler = handler;
    }

    public void setNextHandler(BaseHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    /** 如果nextHandler不为空  则执行下一个Handler**/
    public void execute(){
        handlerProcess();
        if(nextHandler != null){
            nextHandler.execute();
        }
    }

    //Handler要执行的业务逻辑
    protected abstract void handlerProcess();


}
