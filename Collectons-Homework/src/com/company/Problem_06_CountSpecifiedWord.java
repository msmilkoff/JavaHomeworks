package com.company;

import java.util.Scanner;

public class Problem_06_CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String target = scanner.nextLine();
        input = input.toLowerCase();

        String[] sentence = input.split("\\W+");

        int occurrences = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].equals(target)){
                occurrences++;
            }
        }

        System.out.println(occurrences);
    }
}
