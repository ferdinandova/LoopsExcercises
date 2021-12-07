package com.company;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int number = Integer.parseInt(scanner.nextLine());
        int reverseNumber = 0;


        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber* 10 +lastDigit;

            number = number / 10;
        }
        System.out.println(reverseNumber);
    }
}
/*
Напишете програма, която приема числото N и обръща цифрите му наобратно.
 */