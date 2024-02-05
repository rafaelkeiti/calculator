package com.azuma.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/calendarydigital")
public class DateController {

    @GetMapping
    public String calendary() {
        return "Olá, sou um calendário digital.";
    }

    @GetMapping("/datesum")
    public String calculator(@RequestParam(name = "days") Integer days) {

        LocalDate date = LocalDate.now().plusDays(days);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return date.format(format);
    }

    @GetMapping("/datedifference")
    public String dateDifference(
            @RequestParam(name = "start") String date1,
            @RequestParam(name = "end") String date2
    ) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate start = LocalDate.parse(date1, format);
        LocalDate end = LocalDate.parse(date2, format);

        Period difference = Period.between(start, end);

        int days = difference.getDays();
        int months = difference.getMonths();
        int years = difference.getYears();

        return String.format("Data Inicial: %s | Data Final: %s | Diferença: %d anos, %d meses, %d dias",
                start.format(format), end.format(format), years, months, days);
    }
}