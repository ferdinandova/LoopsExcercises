package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.print(number + "! = ");
        for (int factorial = number; factorial >= 1; factorial--) {

            if (factorial == 1) {
                System.out.print(factorial);
            } else {
                System.out.print(factorial + " * ");
            }
        }
    }
}
/*
Напишете програма, която приема числото N и извежда N!. Например, 5! = 5 * 4 * 3 * 2 * 1.
 */