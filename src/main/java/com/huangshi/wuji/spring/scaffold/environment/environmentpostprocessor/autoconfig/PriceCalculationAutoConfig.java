package com.huangshi.wuji.spring.scaffold.environment.environmentpostprocessor.autoconfig;

import com.huangshi.wuji.spring.scaffold.environment.environmentpostprocessor.calculator.GrossPriceCalculator;
import com.huangshi.wuji.spring.scaffold.environment.environmentpostprocessor.calculator.NetPriceCalculator;
import com.huangshi.wuji.spring.scaffold.environment.environmentpostprocessor.calculator.PriceCalculator;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
public class PriceCalculationAutoConfig {

    @Bean
    @ConditionalOnProperty(name = "com.huang.environmentpostprocessor.calculation.mode", havingValue = "NET")
    @ConditionalOnMissingBean
    public PriceCalculator getNetPriceCalculator() {
        return new NetPriceCalculator();
    }

    @Bean
    @ConditionalOnProperty(name = "com.huang.environmentpostprocessor.calculation.mode", havingValue = "GROSS")
    @ConditionalOnMissingBean
    public PriceCalculator getGrossPriceCalculator() {
        return new GrossPriceCalculator();
    }

}