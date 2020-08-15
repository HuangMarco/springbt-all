package com.huangshi.wuji.arch.avoid.ifelse.implementation.enuminstance;

public enum Status {

    NEW(0), RUNNING(1), STOP(2), BLOCKED(3), EXIT(4);

    //注意statusCode必须是public，才能在外部不同包的程序中访问
    public int statusCode;

    Status(int statusCode) {
        this.statusCode = statusCode;
    }

}
