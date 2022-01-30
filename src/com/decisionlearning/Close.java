package com.decisionlearning;

import java.util.Scanner;

public class Close {
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

        boolean result = method(a,b,c);
        System.out.println(result);
    }

    public static boolean method(int a , int b , int c){
        if(a%b==0 || a%b == 1 || b%a == -1){
            return true;
        }
        else if(a%c == 0 || a%c == 1 || c%a == -1){
            return true;
        }
        else{
            return false;
        }
    }


}
