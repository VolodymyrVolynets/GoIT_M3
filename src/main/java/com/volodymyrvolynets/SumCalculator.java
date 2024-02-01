package com.volodymyrvolynets;

public class SumCalculator {
    int sum(int a ) {
        if (a <= 0) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for(int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
