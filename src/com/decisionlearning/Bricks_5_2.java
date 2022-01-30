package com.decisionlearning;

import java.util.Scanner;

public class Bricks_5_2 {
    public static void main(String[] args) {
        System.out.println("Enter length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Chosen length: " + length);
        boolean result = method(length);
        System.out.println(length);

    }

    public static boolean method(int length) {
        if (length % 5 == 0 || length %2 == 0) {
            return true;
        }
         else {
            return false;
        }

    }
}




