package com.company;

import java.util.Scanner;

public class SumNumbersInInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the beggining of the interval N: ");
        int N = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the end of the interval M: ");
        int M = Integer.parseInt(scanner.nextLine());
        int number = N;
        int numberSum = 0;

        while (number <= M) {
            numberSum = numberSum + number;
            number++;
        }
        System.out.println(numberSum);
    }
}

/*
Напишете програма, която приема числата N и M (N < M) и извежда сумата на числата в интервала [N … M].
 */