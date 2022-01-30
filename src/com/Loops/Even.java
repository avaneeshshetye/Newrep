package com.Loops;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        for (int i = 0; i <= n; i++) {

            if (i % 2 == 0) {
                temp+=i;
            }
            System.out.println(temp);

        }


    }
}
