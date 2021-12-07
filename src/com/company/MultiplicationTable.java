package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int number = Integer.parseInt(scanner.nextLine());
        int result = 1;

        for (int multiplication =0 ; multiplication<=10; multiplication++) {
            result = number*multiplication;
            System.out.println(number + " * " + multiplication + " = " + result);
        }
    }
}
/*
Напишете програма, която приема числото N и принтира част от таблицата за умножение.

Input
5
Output
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
 */