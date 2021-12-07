package com.company;

import java.util.Scanner;

public class Aggregation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers count :");
        int numberCount = Integer.parseInt(scanner.nextLine());
        int min = 0;
        int max = 0;
        int sum = 0;
        double average = 1;

        System.out.println("Now enter " + numberCount + " numbers:");
        for (int num = 1; num <= numberCount; num++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (num == 1) {
                min = number;
                max = number;
            }
            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
            sum += number;
        }
        average =  sum / (double) numberCount;

        System.out.println("Min number is: " + min);
        System.out.println("Max number is: " + max);
        System.out.println("Sum of all " + numberCount + " numbers is: " + sum);
        System.out.println("Average sum of them is: " + average);
    }
}
/*
Напишете програма, която приема N реални числа. Програмата трябва да извежда минималното число, максималното число,
сумата на числата, както и средноаритметичната стойност на числата.

Input
4
1
2
3
4
Output
Min: 1
Max: 4
Sum: 10
Average: 2.5
 */