package com.company;

import java.util.Scanner;

public class SetsOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers count:");
        int numberCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int product = 1;

        System.out.println("Now enter " + numberCount + " numbers:");
        for (int num = 1; num <= numberCount; num++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                sum += number;
            } else {
                product *= number;
            }
        }
        System.out.println("Even numbers sum: " + sum);
        System.out.println("Odd numbers product: " + product);
    }
}
/*
Напишете програма, която приема N цели числа. Програмата трябва да извежда сумата на четните числа и произведението на нечетните числа.

Input
3
1
2
3
Output
Even numbers sum: 2
Odd numbers product: 3
 */
