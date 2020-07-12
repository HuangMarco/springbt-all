package com.huangshi.wuji.spring.scaffold.designpattern.responsibilitychain.rough.client;

import com.huangshi.wuji.spring.scaffold.designpattern.responsibilitychain.rough.handler.BaseHandler;

public class TestHandler {

    static class HandlerA extends BaseHandler{
        @Override
        protected void handlerProcess() {
            System.out.printf("handler by A\n");
        }
    }
    static class HandlerB extends BaseHandler{
        @Override
        protected void handlerProcess() {
            System.out.printf("handler by B\n");
        }
    }

    static class HandlerC extends BaseHandler{
        @Override
        protected void handlerProcess() {
            System.out.printf("handler by C \n");
        }
    }

    public static void main(String[] args) {

        BaseHandler handlerA = new HandlerA();
        BaseHandler handlerB = new HandlerB();
        BaseHandler handlerC = new HandlerC();

        /**
         * 将下个Handler赋值给当前Handler中的NextHandler属性
         * 有点像HashMap中的Node  每个Node存储着下一个Node
         */

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.execute();
    }

}
