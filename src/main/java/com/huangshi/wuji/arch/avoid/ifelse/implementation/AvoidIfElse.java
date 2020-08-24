package com.huangshi.wuji.arch.avoid.ifelse.implementation;

import com.huangshi.wuji.arch.avoid.ifelse.implementation.enuminstance.Status;
import com.huangshi.wuji.arch.avoid.ifelse.implementation.inteface.Foo;
import com.huangshi.wuji.arch.avoid.ifelse.implementation.lamda.UserFoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class AvoidIfElse {

    public static void main(String[] args) {
        //使用枚举方式避免if else
        int statusCode = Status.valueOf("NEW").statusCode;
        System.out.println(statusCode);


        UserFoo userFoo = new UserFoo();

        /**
         * 接下来介绍Function接口，为通过Function接口来达到减少if-else做准备
         */
        //使用Lambda之前，使用声明创建的接口方式
        Foo foo = string -> string + " from lambda";
        String result = userFoo.add("It is a message", foo);
        System.out.println(result);

        //使用Lambda之前，使用Funtional接口
        Function<String, String> funct = stringToBeAdded -> stringToBeAdded + "from function interface";
        String resultWithFunction = userFoo.add("It is a mesage", funct);
        System.out.println(resultWithFunction);

        /**
         * 开始使用Function接口
         * 另外提一句，如果需要接受参数却无返回值，使用Consumer接口，但是就无法满足去除if else的需要了
         */

        Map<String, Function<String, String>> functionMap = new HashMap<>();

        Function<String, String> sunnameIsHuangFunction = sunname -> {
            System.out.println(sunname + " is really NB!!!!!!");
            return sunname + " is really NB!!!!!!";
        };
        Function<String, String> sunnameIsWFunction = rubbishName -> {
            System.out.println(rubbishName + " is really SHABI!!!!!!");
            return rubbishName + " is really SHABI!!!!!!";
        };

        functionMap.put("Wang", sunnameIsWFunction);
        functionMap.put("Huang", sunnameIsHuangFunction);

        functionMap.get("Huang").apply("Huang");
        functionMap.get("Wang").apply("Wang");

        //使用Optional
        Optional<UserFoo> op = Optional.ofNullable(userFoo);

    }
}
