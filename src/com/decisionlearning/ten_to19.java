package com.decisionlearning;

import java.util.Scanner;

public class ten_to19 {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();

        System.out.println("Enter b: ");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        int result = sum(a,b);
        System.out.println(result);

    }

    public static int sum(int a, int b){
        if((a+b) >= 10 && (a+b) <= 19){
            return 20;
        }
        return a+b;
    }
}
