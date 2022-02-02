package com.Arrays;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
          generate(choice);
    }
    public static void generate(int choice) {

        for (int i = 1; i <= choice; i++) {
            float result =((float)1 / i); // i=1,
            System.out.println(result);
        }

    }



}
