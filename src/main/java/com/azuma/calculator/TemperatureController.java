package com.azuma.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    public String temperature() {
        return "Olá, sou um conversor de temperatura.";
    }

    @GetMapping("/temperatureconversion")
    public String calculator(@RequestParam(name = "valuetemperature") Float valuetemperature,
                             @RequestParam(name = "typetemperature") String typetemperature) {
        Float responsevalue = null;
        String responsetype = null;
        switch (typetemperature) {
            case "celsius":
                responsevalue = (valuetemperature * 9/5) + 32;
                responsetype = "Fahrenheit";
                break;
            case "fahrenheit":
                responsevalue = (valuetemperature - 32) * 5/9;
                responsetype = "Celsius";
                break;
        }
        return valuetemperature + " " + typetemperature + " equivale a " + responsevalue + " " + responsetype;
    }
}
