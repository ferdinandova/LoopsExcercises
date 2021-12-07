package com.company;

import java.util.Scanner;

public class SumCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the count of your numbers: ");
        int n =Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for(int i = 1; i<= n;i++ ) {
            double name =  1.0/i;
            System.out.println(name);
            sum += name;
            double sum1 = sum;
        }
        System.out.println("Sum is: " + sum);
    }
}
/*
Напишете програма, която приема числото N и извежда стойността на сумата:
1 + 1/2 + 1/3 + 1/4 + … + 1/N.
 */