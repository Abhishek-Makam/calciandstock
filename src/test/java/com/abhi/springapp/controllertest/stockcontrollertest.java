package com.abhi.springapp.controllertest;

import com.abhi.springapp.controller.stockcontroller;
import com.abhi.springapp.model.stock;
import com.abhi.springapp.service.stockservice;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import java.util.List;
@ExtendWith(MockitoExtension.class)
public class stockcontrollertest {

    @Mock
    private stockservice stockService;

    @InjectMocks
    private stockcontroller stockController;

    @Test
    public void testGetStockData() throws Exception {
        List<stock> expectedStocks = new ArrayList<>();
        // Add some sample Stock objects to the expected list

        // Mocking stockService behavior
        when(stockService.getCompanyData()).thenReturn(expectedStocks);

        List<stock> actualStocks = stockController.getStockData();
        assertEquals(expectedStocks.size(), actualStocks.size());
        // Add more assertions based on the expected behavior
    }
}