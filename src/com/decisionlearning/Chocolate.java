package com.decisionlearning;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        System.out.println("Enter goal: ");
        Scanner sc = new Scanner(System.in);
        int goal = sc.nextInt();
        int result = chocolate(goal);
        System.out.println(result);

    }

    public static int chocolate(int goal){
        if(goal > 5){
            int remaining = goal % 5;
            return remaining;
        }
        else{
            return -1;
        }

    }

    }


