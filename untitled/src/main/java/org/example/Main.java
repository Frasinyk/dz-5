package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        int c = 3;
        int d = 6;
        int sum1 = a + b; // 1

        int sum2 = c + d; // 2
        if (sum1 > sum2) {
            System.out.println(true); //3
        }
        int newSum1 = sum1 + 1; //4
        int newSum2 = sum2 - 2; //5
        if (newSum1 > newSum2) { //6
            System.out.println(true);
        }
        if (newSum1 % 2 == 0 || newSum2 % 2 == 0) { //7
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}