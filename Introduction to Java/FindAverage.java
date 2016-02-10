package com.company;


import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double first = scan.nextDouble();
        System.out.println("Enter second number");
        double second = scan.nextDouble();
        System.out.println("Enter third number");
        double third = scan.nextDouble();

        printAverage(first, second, third);

    }

    private static void printAverage(double first, double second, double third) {

        double average = (first + second + third) / 3;
        System.out.println("Average:");
        System.out.printf("%.2f", average);
    }

}
