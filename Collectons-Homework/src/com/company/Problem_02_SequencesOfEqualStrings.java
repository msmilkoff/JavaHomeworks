package com.company;

import java.util.Scanner;

public class Problem_02_SequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArgs = input.split(" ");

        System.out.print(inputArgs[0] + " ");
        for (int i = 1; i < inputArgs.length; i++) {
                if (inputArgs[i].equals(inputArgs[i-1])){
                    System.out.print(inputArgs[i] + " ");
                }else{
                    System.out.print("\n" + inputArgs[i] + " ");
                }
            }
        }
    }

