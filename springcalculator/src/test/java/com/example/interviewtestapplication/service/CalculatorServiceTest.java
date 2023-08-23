package com.example.interviewtestapplication.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    public void testAddition() {
        int result = calculatorService.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testZero() {
        int result = calculatorService.add(0, 0);
        assertEquals(0, result);
    }

}