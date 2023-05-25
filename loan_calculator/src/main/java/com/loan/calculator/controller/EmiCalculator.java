package com.loan.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmiCalculator {
    @GetMapping("/all")
    public String getMessage() {
        return "EMI";
    }
}
