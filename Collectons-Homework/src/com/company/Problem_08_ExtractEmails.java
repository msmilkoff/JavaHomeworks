package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_08_ExtractEmails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String pattern = "([a-z0-9]+[a-z0-9-.]+@[a-z]+[a-z-.]+\\.[a-z]+)";

        Pattern regex = Pattern.compile(pattern);
        Matcher emailMatcher = regex.matcher(text);

        while (emailMatcher.find()){
            System.out.println(emailMatcher.group(1));
        }
    }
}