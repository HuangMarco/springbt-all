package com.huangshi.wuji.spring.scaffold.designpattern.responsibilitychain.chain;

import com.huangshi.wuji.spring.scaffold.designpattern.responsibilitychain.chain.handler.ChainBaseHandler;

import java.util.Arrays;
import java.util.List;

public class Client {

    static class ChainHandlerA extends ChainBaseHandler{
        @Override
        protected void handlerProcess() {
            System.out.println("handler by chain A");
        }
    }
    static class ChainHandlerB extends ChainBaseHandler{
        @Override
        protected void handlerProcess() {
            System.out.println("handler by chain B");
        }
    }
    static class ChainHandlerC extends ChainBaseHandler{
        @Override
        protected void handlerProcess() {
            System.out.println("handler by chain C");

        }
    }

    public static void main(String[] args) {
        /**
         * 声明HandlerList关系链 通过数组顺序排序
         * 不再像之前那样手动给当前Handler中的NextHandler设置值
         * 同样每个chain中间没有相互的依赖 实现解耦
         */

        List<ChainBaseHandler> handlerList = Arrays.asList(
                new ChainHandlerA(),
                new ChainHandlerB(),
                new ChainHandlerC()
        );

        Chain chain = new Chain(handlerList);
        chain.proceed();


    }

}
