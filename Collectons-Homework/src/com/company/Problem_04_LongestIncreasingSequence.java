package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_04_LongestIncreasingSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArgs = input.split(" ");
        int[] numbers = new int[inputArgs.length];

        for (int i = 0; i < inputArgs.length; i++) {
            numbers[i] = Integer.parseInt(inputArgs[i]);
        }
        ArrayList<Integer> current = new ArrayList<>();
        ArrayList<Integer> longest = new ArrayList<>();

        System.out.print(numbers[0] + " ");
        current.add(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i-1]){
                System.out.print(numbers[i] + " ");
                current.add(numbers[i]);
            }
            else{
                System.out.print("\n" + numbers[i] + " ");
                if (current.size() > longest.size()){
                    longest.clear();
                    for (Integer integer : current) {
                        longest.add(integer);
                    }
                }
                current.clear();
                current.add(numbers[i]);
            }
        }

        if (current.size() > longest.size()){
            longest.clear();
            for (Integer integer : current) {
                longest.add(integer);
            }
        }
        current.clear();

        System.out.println();
        System.out.print("Longest: " + longest);
    }
}
