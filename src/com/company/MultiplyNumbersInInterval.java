package com.company;

import java.util.Scanner;

public class MultiplyNumbersInInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the beginning of the interval N: ");
        int N = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the end of the interval M: ");
        int M = Integer.parseInt(scanner.nextLine());
        int number = N;
        long numberProduct = 1;

        while (number <= M) {
            numberProduct = numberProduct * number;
            number++;
        }

        System.out.println(numberProduct);
    }
}
/*
Напишете програма, която приема числата N и M (N < M) и извежда произведението на числата в интервала [N … M].
 */
