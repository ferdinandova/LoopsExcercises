package com.company;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}

/*
Напишете програма, която принтира четните числа в интервала [1 … 100].
 */
