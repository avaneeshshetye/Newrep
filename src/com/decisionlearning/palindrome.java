package com.decisionlearning;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        /*
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String pal = String.valueOf(sc.nextInt());
        System.out.println("Entered"+ pal);

         */
        char pal[] = {3, 4, 3, 3, 4, 3};
        palin(pal);

    }

    public static void palin(char[] pal) {
        int j = pal.length;

        for (int i = 0; i < pal.length / 2; i++) {
            j--;
            if (pal[i] != pal[j]) {
                System.out.println("Not a palindrome");
                return;

            }

        }
        System.out.println("Is a palindrome");
        }


    }





