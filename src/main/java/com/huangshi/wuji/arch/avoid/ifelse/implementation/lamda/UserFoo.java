package com.huangshi.wuji.arch.avoid.ifelse.implementation.lamda;

import com.huangshi.wuji.arch.avoid.ifelse.implementation.inteface.Foo;

import java.util.function.Function;

public class UserFoo{


    public String add(String string, Foo foo) {
        return foo.add(string);
    }

    public String add(String string, Function<String, String> fn) {
        return fn.apply(string);
    }
}
