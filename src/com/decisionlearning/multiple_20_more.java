package com.decisionlearning;

import java.util.Scanner;

public class multiple_20_more {
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(Math.abs(value));

        boolean result = multiple(Math.abs(value));
        System.out.println(result);
    }

    public static boolean multiple(int value){
        if(value % 20 == 1 || value % 20 == 2){
            return true;
        }
        else if(value % 20 == 0){
            return false;
        }
        else{
            return false;
        }
    }

}
