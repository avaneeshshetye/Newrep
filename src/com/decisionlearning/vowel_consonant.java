package com.decisionlearning;

import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        System.out.println("Enter an alphabet");
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);




        if(alphabet == 'a' || alphabet =='A' || alphabet == 'e' || alphabet =='E' || alphabet == 'I' || alphabet =='i' || alphabet == 'O' || alphabet == 'o' || alphabet == 'U' || alphabet == 'u') {
            System.out.println("Its a vowel");
        }
        else if(alphabet == 'b' || alphabet == 'c' || alphabet == 'g' || alphabet == 'd' || alphabet == 'f' || alphabet == 'h') {

        }

       // else{
           // System.out.println("Its a consonant");
      //  }

    }
}
