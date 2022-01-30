package com.decisionlearning;

import java.util.Scanner;

public class rightmost_digit {
    public static void main(String[] args) {
        System.out.println("Insert A");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Insert B");
        Scanner sc1 = new Scanner(System.in);
        int b = Math.abs(sc1.nextInt());

        System.out.println("Insert C");
        Scanner sc2 = new Scanner(System.in);
        int c = Math.abs(sc2.nextInt());

        boolean result = method(a,b,c);
        System.out.println(result);
    }

    public static boolean method(int a, int b, int c){

        if(a==b || b==c){
            return true;
        }
        else{
            return false;
        }
    }
}
