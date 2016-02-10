package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem_10_ExtractUniqueWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        String[] inputArgs = input.split("\\W");

        HashSet<String> uniqueWords = new HashSet<>();
        for (int i = 0; i < inputArgs.length; i++) {
            uniqueWords.add(inputArgs[i]);
        }

        TreeSet<String> sortedWords = new TreeSet<>();
        sortedWords.addAll(uniqueWords);

        for (String word : sortedWords) {
            System.out.print(word + " ");
        }
    }
}
