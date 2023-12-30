package com.abhi.springapp.servicetest;

import com.abhi.springapp.service.calculatorservice;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.stereotype.Service;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;

@ExtendWith(MockitoExtension.class)
public class calculatorservicetest {
    @InjectMocks
    private calculatorservice calculatorService;

    @Test
    public void testAdd() {
        int result = calculatorService.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = calculatorService.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        int result = calculatorService.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        double result = calculatorService.divide(10, 2);
        assertEquals(5.0, result);
    }

    @Test
    public void testDivideByZero() {
        // Test division by zero scenario
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(10, 0));
    }

}