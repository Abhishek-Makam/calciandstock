package com.abhi.springapp.controller;

import com.abhi.springapp.model.stock;
import com.abhi.springapp.service.stockservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stocks")
@AllArgsConstructor
public class stockcontroller {
    private final stockservice stockservice;
    @GetMapping("/getStockData")
    public List<stock> getStockData() throws Exception
    {
        return stockservice.getCompanyData();
    }
}