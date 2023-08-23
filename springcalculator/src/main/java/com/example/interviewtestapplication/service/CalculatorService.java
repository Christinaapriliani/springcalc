package com.example.interviewtestapplication.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int int1, int int2) {
        return int1 * int2;
    }
}
