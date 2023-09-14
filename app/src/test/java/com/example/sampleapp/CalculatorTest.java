package com.example.sampleapp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/sum.csv")
    @DisplayName("sumのテスト1")
    void sum(int a, int b, int expected) {
        Calculator calc = new Calculator();
        int result = calc.sum(a, b);
        assertEquals(result, expected);
    }
}