package com.company;

import java.util.Scanner;

public class DigitsProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int digitsProduct = 1;

        while (number != 0 ) {
            digitsProduct = digitsProduct * (number % 10);
            number = number / 10;
        }
        System.out.println("The product of your number's digits is: " + digitsProduct);

    }
}
/*
Напишете програма, която приема числото N и извежда произведението на цифрите му.

Input
123
Output
6

Input
345
Output
60
 */
