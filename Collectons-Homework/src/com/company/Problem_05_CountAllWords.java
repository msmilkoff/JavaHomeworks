package com.company;

import java.util.Scanner;

public class Problem_05_CountAllWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] result = sentence.split("\\W+");
        System.out.println(result.length);
    }
}
