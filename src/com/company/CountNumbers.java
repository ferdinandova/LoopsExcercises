package com.company;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int counterPos = 0;
        int counterNeg = 0;

        do{
            System.out.println("Please enter the count of your numbers: ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n<0);

        for (int i = 0; i<n; i++) {
            double number = Integer.parseInt(scanner.nextLine());

            if (number> 0) {
                counterPos ++;
            } else if (number<0) {
                counterNeg ++;
            }
        }
        System.out.println("Positive  numbers are: " + counterPos);
        System.out.println("Negative numbers are: " + counterNeg);
    }
}
/*
Напишете програма, която приема N реални числа, различни от 0. Програмата трябва да извежда броя на
положителните числа и броя на отрицателните числа.

Input
5
-20
20
-30
40
10
Output
Positive numbers count: 3
Negative numbers count: 2
 */