package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_14_SortArrayStreamAPI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArgs = input.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String word : inputArgs) {
            numbers.add(Integer.parseInt(word));
        }

        List<Integer> ascendingNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        String sortMethod = scanner.nextLine();

        if (sortMethod.equals("Ascending")){
            System.out.println(ascendingNumbers);
        }else if (sortMethod.equals("Descending")){
            Collections.reverse(ascendingNumbers);
            System.out.println(ascendingNumbers);
        }
    }
}
