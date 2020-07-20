package com.huangshi.wuji.spring.scaffold.environment.environmentpostprocessor.service;

import com.huangshi.wuji.spring.scaffold.environment.environmentpostprocessor.calculator.PriceCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PriceCalculationService {

    @Autowired
    PriceCalculator priceCalculator;

    public double productTotalPrice(double singlePrice, int quantity) {
        return priceCalculator.calculate(singlePrice, quantity);
    }
}
