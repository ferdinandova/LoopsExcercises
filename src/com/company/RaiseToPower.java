package com.company;

import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter M: ");
        int exponent = Integer.parseInt(scanner.nextLine());
        int result = 1;

        for (int index = 1; index <= exponent; index++) {
            result = number * result;
        }
        System.out.println(result);
    }
}
/*
Напишете програма, която приема числата N и M, и повдига N на степен M.
 */