package com.example.sampleapp;

public class Calculator {
    public int a = 0;
    public int b = 0;
    public int result = 0;
    private void input(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(int a, int b) {
        input(a, b);
        result = a + b;
        return result;
    }
}
