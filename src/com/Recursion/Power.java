package com.Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.println("Enter base");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter exponent");
        Scanner sc1 = new Scanner(System.in);
        int y = sc1.nextInt();
        int result = calc(x,y);
        System.out.println(result);
    }
    public static int calc(int x,int y){
        if(y==1){
            return x;
        }
        else{
            return x*calc(x,y-1);
        }
    }
}
