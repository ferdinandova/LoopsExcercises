package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int divider = 1; divider < number; divider++) {
            if (number % divider == 0) {
                sum += divider;
            }
        }
        if (sum == number) {
            System.out.println(number + " is perfect number.");
        } else {
            System.out.println(number + " is not perfect number.");
        }
    }
}
/*
Напишете програма, която приема числото N и проверява дали N е съвършено число.
Съвършено число се нарича естествено число,
което е точна сума от своите по-малки делители. Например, числото 6 е съвършено,
тъй като е равно на сумата от неговите делители: 1 + 2 + 3 = 6.
 */