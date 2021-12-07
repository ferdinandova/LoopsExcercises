package com.company;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number you want to check: ");
        int number = Integer.parseInt(scanner.nextLine());
        int prime = 0;

        for (int numerator = 1; numerator <= number; numerator++) {
            if (number % numerator == 0) {
                prime++;
            }
            if (prime > 2) {
                break;
            }
        }
        if (prime <= 2) {
            System.out.println("Your number is prime.");
        } else {
            System.out.println("Your number is not prime.");
        }


    }
}
/*
Напишете програма, която приема числото N и извежда дали N е просто число.
 */