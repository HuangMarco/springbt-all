package com.huangshi.wuji.spring.scaffold.aspectj.simpleexample;

public class HelloWord {

    public void sayHello(){
        System.out.println("hello world !");
    }

    public static void main(String args[]){
        HelloWord helloWord =new HelloWord();
        helloWord.sayHello();
    }
}
