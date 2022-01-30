package com.decisionlearning;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("First value: " + a);

        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("Second value: " + b);

        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();
        System.out.println("Second value: " + c);

        int result = sum(a, b, c);
        System.out.println(result);
    }




    public static int sum(int a,int b, int c){
        if(a == b){
            return c;
        }
        else if(b==c){
            return a;
        }
        else if(a==c){
            return b;
        }
        else{
            return a+b+c;
        }

    }
}
