package com.company;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int digitsSum = 0;

        while (number != 0 ) {
            digitsSum = digitsSum + number%10;
            number = number/10;
        }
        System.out.println("The sum of your number's digits is: " + digitsSum);

    }
}
/*
Напишете програма, която приема числото N и извежда сумата на цифрите му.

Input
3434
Output
14

Input
123
Output
6
 */