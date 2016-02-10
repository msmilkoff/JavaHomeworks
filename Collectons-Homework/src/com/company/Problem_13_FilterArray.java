package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_13_FilterArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArgs = input.split(" ");

        List<String> sentence = new ArrayList<>();
        Collections.addAll(sentence, inputArgs);

        List<String> filtered = sentence.stream()
                .filter(p -> p.length() > 3)
                .collect(Collectors.toList());

        if (filtered.size() == 0){
            System.out.println("(empty)");
        }else{
            for (String word : filtered) {
                System.out.print(word + " ");
            }
        }
    }
}
