package com.company;

import java.util.Scanner;

public class PrintFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int number = Integer.parseInt(scanner.nextLine());

        for(int row = 1; row<= number; row++) {
            System.out.print("*");
        }
        System.out.println();

        for(int row = 1; row <= (number - 2); row ++) {
            System.out.print("*");
            for(int spaceNumber = number-2; spaceNumber<=number; spaceNumber++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int row = 1; row<= number; row++) {
            System.out.print("*");
        }

    }
}
/*
Напишете програма, която приема числото N и чертае рамка с широчина N и височина N.

Input
5
Output

*****
*   *
*   *
*   *
*****

 */