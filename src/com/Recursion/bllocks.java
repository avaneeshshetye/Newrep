package com.Recursion;

import java.util.Scanner;

public class bllocks {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        int answer = rows(n);
        System.out.println(answer);
    }
    public static int rows(int n){
        int result;
        if(n==1){
            return 1;
        }
        else{
            return n + rows(n-1);
        }
    }
}
