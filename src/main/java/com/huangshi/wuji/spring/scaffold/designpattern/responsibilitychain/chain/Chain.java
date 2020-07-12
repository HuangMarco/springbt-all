package com.huangshi.wuji.spring.scaffold.designpattern.responsibilitychain.chain;


import com.huangshi.wuji.spring.scaffold.designpattern.responsibilitychain.chain.handler.ChainBaseHandler;

import java.util.List;


public class Chain {

    private List<ChainBaseHandler> handlers;

    private int index = -1;

    public Chain(List<ChainBaseHandler> handlers) {
        this.handlers = handlers;
    }

    /**
     * 通过index自增 调用excute实现递归  遍历整个handlers
     */
    public void proceed(){
        if(index == handlers.size() - 1){
            return;
        }
        handlers.get(++index).execute(this);
    }

}
