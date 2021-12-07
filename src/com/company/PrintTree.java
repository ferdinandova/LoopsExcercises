package com.company;

import java.util.Scanner;

public class PrintTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row <= number; row++) {
            int spaceCount = number - row;
            for (int counter=1; counter<=spaceCount; counter++) {
                System.out.print(" ");
            }

            int stars = row;
            for(int counter = 1; counter<= stars; counter ++) {
                System.out.print("*");
            }
            System.out.print("|");

            for (int counter = 1; counter <= stars; counter ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Напишете програма, която приема числото N и чертае дърво с широчина (2 * N) + 1 и височина N + 1.

Input
4
Output

    |
   *|*
  **|**
 ***|***
****|****

 */