package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_12_CardsFrequencies {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArgs = input.split(" ");

        Map<String, Integer> deck = new LinkedHashMap<>();
        for (String card : inputArgs) {
            Integer count = deck.get(card);
            if (count == null){
                count = 0;
            }
            deck.put(card, count +1 );
        }

        for (Map.Entry<String, Integer> entry : deck.entrySet()) {
            double frequency = entry.getValue()*100.0/inputArgs.length;
            System.out.printf("%s -> %.2f%%\r\n", entry.getKey(), frequency);
        }
    }
}
