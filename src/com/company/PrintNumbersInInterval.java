package com.company;

import java.util.Scanner;

public class PrintNumbersInInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the beggining of the interval N: ");
        int N = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the end of the interval M: ");
        int M = Integer.parseInt(scanner.nextLine());

        if (N < M) {
            for (int number = N; number <= M; number++) {
                System.out.println(number);
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
/*
Напишете програма, която приема числата N и M (N < M) и принтира числата в интервала [N … M].
 */
