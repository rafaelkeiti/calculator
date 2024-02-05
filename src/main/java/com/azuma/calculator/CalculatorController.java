package com.azuma.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping
    public String calculator() {
        return "Olá, sou uma calculadora.";
    }

    @GetMapping("/calcular")
    public Float calculator(@RequestParam(name = "value1") Integer value1,
                            @RequestParam(name = "value2") Integer value2,
                            @RequestParam(name = "signal") String signal) {
        Float responsevalue = null;
        switch (signal) {
            case "sum":
                responsevalue = (float) (value1 + value2);
                break;
            case "subtraction":
                responsevalue = (float) (value1 - value2);
                break;
            case "division":
                responsevalue = (float) (value1 / value2);
                break;
            case "multiplication":
                responsevalue = (float) (value1 * value2);
                break;
        }
        return responsevalue;
    }
}