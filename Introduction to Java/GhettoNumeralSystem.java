package com.company;

import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] word = {"Gee","Bro","Zuz","Ma","Duh","Yo","Dis","Hood","Jam","Mack"};

        for (int i = 0; i < input.length() ; i++) {
            System.out.print(word[Integer.parseInt(String.valueOf(input.charAt(i)))]);
        }
    }
}
