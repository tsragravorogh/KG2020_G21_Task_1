package com.company;

public class Utils {
    public static int getRandom(int to) {
        int from = 1;
        return from + (int) (Math.random() * to);
    }
}