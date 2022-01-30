package com.decisionlearning;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.next();

        String result = word(alphabet);
        System.out.println(result);
    }

    public static String word(String alphabet){
        if(alphabet.equals("f")){
            return "fizz";
        }
        else if(alphabet.equals("b")){
            return "buzz";
        }
        else{
            return alphabet;
        }
    }
}
