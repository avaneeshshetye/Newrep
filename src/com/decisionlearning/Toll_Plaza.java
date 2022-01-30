package com.decisionlearning;

import java.util.Scanner;

public class Toll_Plaza {
    public static void main(String[] args) {
        System.out.println("****Hello, welcome to toll plaza****");
        System.out.println("How far are you going today?");
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        System.out.println("You are travelling " +distance+ " kilometres");

        if(distance <= 100){
            System.out.println("You have been charged 100 rupees");
        }
        else if(distance >= 101 && distance <= 500){
            System.out.println("You have been charged 500 rupees");
        }
        else if(distance >= 501 && distance <= 1000){
            System.out.println("You have been charged 1000 rupees");
        }
        else if(distance > 1000){
            System.out.println("You have been charged 2000 rupees");
        }

        else{
            System.out.println("Invalid input");
        }
    }
}
