package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_03_LargestSequenceOfEqualStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] words = input.split(" ");

        ArrayList<String> current = new ArrayList<>();
        ArrayList<String> largest = new ArrayList<>();

        current.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i-1])){
                current.add(words[i]);
            }
            else{
                if (current.size() > largest.size()){
                    largest.clear();
                    for (String word : current) {
                        largest.add(word);
                    }
                }
                current.clear();
                current.add(words[i]);
            }
        }

        if (current.size() > largest.size()){
            largest.clear();
            for (String word : current) {
                largest.add(word);
            }
        }
        current.clear();

        System.out.println();
        System.out.print(largest);
    }
}

