package com.huangshi.wuji.spring.scaffold.conditional.example2.dao;

import java.util.Arrays;
import java.util.List;

public class MongoUserDAO implements UserDAO {

    @Override
    public List<String> getAllUserNames() {

        System.out.println("**** Getting usernames from MongoDB *****");
        return Arrays.asList("Marco", "Huang");
    }
}
