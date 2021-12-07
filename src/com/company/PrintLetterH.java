package com.company;

import java.util.Scanner;

public class PrintLetterH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 != 0) {

            for (int row = 1; row <= (number / 2); row++) {
                System.out.print("*");
                for (int spaceCount = 1; spaceCount <= number - 3; spaceCount++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int mid = 1; mid <= (number-1); mid++) {
                System.out.print("*");
            }
            System.out.println();

            for (int row = 1; row <= (number / 2); row++) {
                System.out.print("*");
                for (int spaceCount = 1; spaceCount <= (number - 3); spaceCount++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
/*
Напишете програма, която при въведено нечетно число N (N > 4) принтира латинската буква H с височина N.

Input
5
Output

*  *
*  *
****
*  *
*  *

 */