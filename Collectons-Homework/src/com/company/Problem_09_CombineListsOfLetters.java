package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_09_CombineListsOfLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        ArrayList<Character> firstList = new ArrayList<>();
        ArrayList<Character> secondList = new ArrayList<>();

        for (int i = 0; i < first.length(); i++) {
            firstList.add(first.charAt(i));
        }
        for (int i = 0; i < second.length(); i++) {
            secondList.add(second.charAt(i));
        }

        for (Character character : secondList) {
            if (!firstList.contains(character)){
                firstList.add(character);
                firstList.add(' ');
            }
        }

        for (Character character : firstList) {
            System.out.print(character);
        }
    }
}
