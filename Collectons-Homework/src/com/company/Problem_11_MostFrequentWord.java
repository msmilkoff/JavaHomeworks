package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_11_MostFrequentWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(input);

        Map<String, Integer> text = new TreeMap<>();
        int frequency = 0;

        while (matcher.find()) {
            String currentWord = matcher.group();
            if(!text.containsKey(currentWord)) {
                text.put(currentWord, 0);
            }

            text.put(currentWord, text.get(currentWord) + 1);
            if(text.get(currentWord) > frequency) {
                frequency = text.get(currentWord);
            }
        }

        for (Map.Entry<String, Integer> word : text.entrySet()) {
            if(word.getValue() == frequency) {
                System.out.printf("%s -> %d times\n", word.getKey(), word.getValue());
            }
        }
    }
}