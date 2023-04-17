package com.makarov.testSpring.control;

import com.makarov.testSpring.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class calculator {
    private final CalculatorService calculatorService;

    public calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String homePage () {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("plus")
    public String  plus(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name="num2",required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Не верно";
        }

        return calculatorService.plus(num1,num2).toString();
    }
    @GetMapping("minus")
    public String minus(
            @RequestParam(name ="num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {

        if (num1 == null || num2 == null) {
            return "Ошибка";
        }

        return calculatorService.minus(num1, num2).toString();
    }
    @GetMapping("multiply")
    public String multiply(
            @RequestParam(name ="num1", required = false) Integer num1,
            @RequestParam(name ="num2", required = false) Integer num2
    ) {

        if (num1 == null || num2 == null) {
            return "Ошибка";
        }

        return calculatorService.multiply(num1, num2).toString();
    }
    @GetMapping("divide")
    public String divide(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name ="num2",required = false) Integer num2
    ) {

        if (num1 == null || num2 == null) {
            return "Ошибка";
        }
        if (num2.equals(0)|| num1.equals(0)) {
            return "Деление на ноль запрещенно";
        }

        return calculatorService.divide(num1, num2).toString();
    }
}
