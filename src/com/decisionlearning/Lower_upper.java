package com.decisionlearning;

import java.util.Scanner;

public class Lower_upper {

    public static void main(String[] args) {
        System.out.println("Enter the alphabet");
        Scanner sc  = new Scanner(System.in);
        String alphabet = sc.next();
        char letter = alphabet.charAt(0);




        if(letter >= 97 && letter <= 122) {
            System.out.println("Its a lower case");

        }
        else if(letter >= 65 && letter <= 90){
            System.out.println("Its an upper case");
        }

        else{
            System.out.println("Entered data is not an alphabet");
        }
    }
}
