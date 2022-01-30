package com.decisionlearning;

import java.util.Scanner;

public class max_using_switch {
    public static void main(String[] args) {
        System.out.println("Enter number 1");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.println("Enter number 1");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc1.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + "Is greater");
        }
        if (num2 > num1) {
            System.out.println(num2 + "Is greater");

        } else
        {
            System.out.println("Invalid Input");
        }

    }
}
