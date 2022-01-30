package com.decisionlearning;

import java.util.Scanner;

public class multiple_3_5 {
    public static void main(String[] args) {
        System.out.println("Enter value");
       Scanner sc = new Scanner(System.in);
       int value = sc.nextInt();
       boolean result = multiple(Math.abs(value));
        System.out.println(result);

    }

    public static boolean multiple(int value){
        if(value % 3 == 0 && value % 5 == 0){
            return false;
        }
          if(value % 3 == 0 || value % 5 == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
