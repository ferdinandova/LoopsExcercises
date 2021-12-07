package com.company;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the beginning of the interval N: ");
        int N = Integer.parseInt(scanner.nextLine());

        for (int number = N; number >= 1; number--) {
            System.out.println(number);
        }
    }
}


/*
Напишете програма, която приема числото N и принтира числата в интервала [N … 1].
 */