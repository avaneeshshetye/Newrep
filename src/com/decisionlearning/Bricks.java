package com.decisionlearning;

import java.util.Scanner;



public class Bricks {
    public static void main(String[] args) {
        System.out.println("Enter length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Chosen length: " + length);
        boolean result = five(length);
        System.out.println(result);

    }

    public static boolean five(int length) {
        if(length % 5 == 0) {
            System.out.print("For brick of length 5 inch its ");
            return true;

        } else {
            System.out.print("For brick of length 1 inch its ");
            return true;
        }

    }
}









