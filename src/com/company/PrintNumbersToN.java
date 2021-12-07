package com.company;

import java.util.Scanner;

public class PrintNumbersToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the end of the interval N: ");
        int N = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= N; number++) {
            System.out.println(number);
        }
    }
}
/*
Напишете програма, която приема числото N и принтира числата в интервала [1 … N].
 */