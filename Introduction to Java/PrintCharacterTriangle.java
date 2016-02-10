package com.company;

import java.util.Scanner;

public class PrintCharacterTriangle {
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++){
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }
        for (int i = n -1; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }
    }
}
