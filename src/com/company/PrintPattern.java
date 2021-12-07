package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= number; row++) {
            for (int digits = 1; digits <= row; digits++) {
                System.out.print(digits);
            }
            for (int stars = 1; stars <= number-row ; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Напишете програма, която приема числото N (0 < N < 10) и чертае следния образец.

Input
5
Output

1****
12***
123**
1234*
12345

 */