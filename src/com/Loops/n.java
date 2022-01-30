package com.Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int k = 9;
        int result = generate(choice);
        System.out.println(result);


    }

    public static int generate(int choice) {
        int i = 0;
        int k = 0;
        int cube = 1;
        int x = 0;


        while (x > 0) {

            for (i = 0; i <= choice; i++) {
                cube = i * cube;
                System.out.print(k + 9 * 10 * cube);
                System.out.print("+");
                cube = 1;

            }

            return k;
        }


        return i;
    }
}



