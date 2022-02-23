package com.Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial is: " + n);
        int answer = Recursion(n);
        System.out.println(answer);
    }

    public static int Recursion(int n) {

        if (n == 1) {
            return n;
        }

        else{
                return n * Recursion(n - 1);
            }


        }
    }

