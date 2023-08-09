package com.example.facade.util;

public class Random {
    public static int generate(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }
}
