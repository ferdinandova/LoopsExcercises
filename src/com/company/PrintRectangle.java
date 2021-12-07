package com.company;

import java.util.Scanner;

public class PrintRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int N = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= N; row++) {
            for (int column = 1; column <= N; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Напишете програма, която приема числото N и чертае правоъгълник с широчина N и височина N.

Input
5
Output

*****
*****
*****
*****
*****

 */