package com.company;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= number; row++) {

            for (int stars = 1; stars <= row; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Напишете програма, която приема числото N и чертае триъгълник с широчина N и височина N.

Input
5
Output

*
**
***
****
*****

 */