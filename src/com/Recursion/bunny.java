package com.Recursion;

import java.util.Scanner;

public class bunny {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = ears(n);
        System.out.println(result);
    }
    public static int ears(int n){
        if(n==1){
            return 2;
        }
        else{
           return 2 + ears(n-1);
        }
    }
}
