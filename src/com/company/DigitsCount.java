package com.company;

import java.util.Scanner;

public class DigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int digitsCount = 0;

        while (number != 0) {
            number = number / 10;
            digitsCount ++;
        }
        System.out.println("Your number has: " + digitsCount + " digits.");

    }
}
/*
Напишете програма, която приема числото N и извежда броя на цифрите му.

Input
4545
Output
4

Input
34934834
Output
8
 */