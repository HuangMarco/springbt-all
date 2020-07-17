package com.huangshi.wuji.spring.scaffold.conditional.example2;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MongoDBDatabaseTypeCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String dbType = System.getProperty("dbType");

        return (dbType!=null && dbType.equalsIgnoreCase("MONGODB"));
    }
}
