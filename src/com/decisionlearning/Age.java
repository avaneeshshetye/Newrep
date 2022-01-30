package com.decisionlearning;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String feel;
        String hair;

        if(age < 18){
            System.out.println("Your a child");
        }
        else if(age >= 18){
            System.out.println("Do you feel tired frequently?(Y/N)");
            Scanner sc1 = new Scanner(System.in);
            feel = sc1.next();
            System.out.println("Are your hair white?(Y/N)");
            Scanner sc2 = new Scanner(System.in);
            hair = sc2.next();

            if(feel.equals("Y")) {
                if(hair.equals("Y"))
                System.out.println("You are old");
            }
                else{
                    System.out.println("You re an adult");
                }

            }






        }
    }





