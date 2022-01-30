package com.decisionlearning;

import java.util.Scanner;

public class Neighbour_zero {
    public static void main(String[] args) {
        System.out.println("Enter first value");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("First value: " + a);

        System.out.println("Enter second value");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("Second value: " + b);

        System.out.println("Enter third value");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();
        System.out.println("Third value: " + c);
        int result = sum(a,b,c);
        System.out.println(result);


    }

    public static int sum(int a, int b, int c) {

        if (a == 13) {
            a = 0;
            b = 0;
            c = 0;
        }
         if (b == 13) {
            b = 0;
            c = 0;
        }
         if (c == 13) {
            c = 0;
        }
        return a+b+c;



    }

}
