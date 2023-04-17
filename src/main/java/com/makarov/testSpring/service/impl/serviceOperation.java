package com.makarov.testSpring.service.impl;

import com.makarov.testSpring.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service

public class serviceOperation implements CalculatorService {
    @Override
    public String plus(Integer num1, Integer num2) {
        return String.valueOf(num1 + num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        return String.valueOf(num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        return String.valueOf(num1 * num2);
    }

    @Override
    public String  divide(Integer num1, Integer num2) {
        return String.valueOf(num1 / num2);
    }
}
