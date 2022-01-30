package com.Loops;

import java.util.Scanner;

public class xpowern {
    public static void main(String[] args) {
        System.out.println("Enter input 1");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Enter input 2");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int temp = 1;
        for( int i = 1; i<=n; i++){
            temp = temp*x;
        }
        System.out.println(temp);
    }


}
