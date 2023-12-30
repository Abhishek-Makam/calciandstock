package com.abhi.springapp.servicetest;

import com.abhi.springapp.model.stock;
import com.abhi.springapp.service.stockservice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.io.IOException;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class stockservicetest {

    @Mock
    private ObjectMapper objectMapper;

    @InjectMocks
    private stockservice stockService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetCompanyData() throws IOException {
        // Mocking ObjectMapper behavior
        //   Mockito.when(objectMapper.readTree(any(URL.class))).thenReturn(null);

        List<stock> stocks = stockService.getCompanyData();

    }
}