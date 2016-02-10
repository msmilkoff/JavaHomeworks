package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Problem_01_SortArrayOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int [] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
/* If this comment is removed the program will blow up */
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
