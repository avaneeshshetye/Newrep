package com.Recursion;

import java.util.Scanner;

public class Rabbits {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number of bunnies: " + n);
        int result=recursion(n);
        System.out.println(result);
    }
    public static int recursion(int n){
        if(n==1){
            return 3;
        }
        else if(n%2==0){
        return 2+recursion(n-1);
        }
        else{
            return 3+recursion(n-1);
        }
    }
}
