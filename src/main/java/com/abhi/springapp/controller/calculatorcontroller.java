package com.abhi.springapp.controller;

import com.abhi.springapp.service.calculatorservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
@AllArgsConstructor
public class calculatorcontroller {
    private final calculatorservice calculatorservice;

    @GetMapping("/add")
    public int add(@RequestParam int a,@RequestParam int b)
    {
        return calculatorservice.add(a,b);
    }
    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return calculatorservice.subtract(a, b);
    }

    @GetMapping("/multiply")
    //Multiply
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return calculatorservice.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b) {
        return calculatorservice.divide(a, b);
    }




}