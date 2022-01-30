package com.decisionlearning;

import java.util.Scanner;

public class Bricks_7_5_2 {
    public static void main(String[] args) {
        System.out.println("Enter length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Chosen length: " + length);
        boolean result = method(length);
        System.out.println(length);
    }

    public static boolean method(int length) {
        if (length % 7 == 0) {
            System.out.println("By 7");
            return true;
        } else if (length % 5 == 0) {
            System.out.println("By using 5");
            return true;
        } else if (length % 2 == 0) {
            System.out.println("By 2");
            return true;
        } else {
            return false;
        }
    }
}
