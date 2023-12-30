package com.abhi.springapp.controllertest;

import com.abhi.springapp.controller.calculatorcontroller;
import com.abhi.springapp.service.calculatorservice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class calculatorcontrollertest {



    @Mock
    private calculatorservice calculatorService;

    private calculatorcontroller calculatorController;

    @BeforeEach
    public void setUp() {
        calculatorController = new calculatorcontroller(calculatorService);
    }

    @Test
    public void testAddEndpoint() throws Exception {
        when(calculatorService.add(3, 5)).thenReturn(8);
        int a = calculatorController.add(3,5);
        assert(a==8);
    }

    @Test
    public void testSubtractEndpoint() throws Exception {
        when(calculatorService.subtract(10, 4)).thenReturn(6);
        int a = calculatorController.subtract(10,4);
        assert(a==6);
    }

    @Test

    public void testMultiplyEndpoint() throws Exception {
        when(calculatorService.multiply(3, 5)).thenReturn(15);
        int a = calculatorController.multiply(3,5);
        assert(a==15);
    }

    @Test

    public void testDivideEndpoint() throws Exception {
        when(calculatorService.divide(10, 2)).thenReturn(5.0);
        double a = calculatorController.divide(10,2);
        assert(a==5.0);
    }

}