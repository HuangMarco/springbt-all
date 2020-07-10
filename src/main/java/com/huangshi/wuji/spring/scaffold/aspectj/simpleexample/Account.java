package com.huangshi.wuji.spring.scaffold.aspectj.simpleexample;

public class Account {

    int balance = 20;

    public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        }
        balance = balance - amount;
        return true;
    }
}
