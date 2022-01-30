package com.decisionlearning;

import java.util.Scanner;

public class ifteen_then20 {
    public static void main(String[] args) {

            System.out.println("Enter a: ");
            Scanner sc1 = new Scanner(System.in);
            int a = sc1.nextInt();

            System.out.println("Enter b: ");
            Scanner sc2 = new Scanner(System.in);
            int b = sc2.nextInt();
            int result = teen(a,b);
            System.out.println(result);
    }

    public static int teen(int a, int b){
        if(a>=13 && a<=19 || b >= 13 && b<=19){
            return 19;
        }
        else{
            return a+b;
        }
    }
}
