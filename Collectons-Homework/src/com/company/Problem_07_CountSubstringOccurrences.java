package com.company;

import java.util.Scanner;

public class Problem_07_CountSubstringOccurrences {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        String target = scanner.nextLine().toLowerCase();

        int occurrences = 0;
        for (int i = 0; i < input.length() - target.length() + 1; i++) {
            if (input.substring(i, i + target.length()).equals(target)){
                occurrences++;
            }
        }

        System.out.println(occurrences);
    }
}
