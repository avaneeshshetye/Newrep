package com.decisionlearning;

import java.util.Scanner;

public class call {
    public static void main(String[] args) {

        System.out.println("What part of the day is it(Morning/afternoon/evening)? : ");
        Scanner sc = new Scanner(System.in);
        String POD = sc.next();

        System.out.println("Is it moms call(Y/N)? : ");
        Scanner sc1 = new Scanner(System.in);
        String phone = sc.next();


        System.out.println("Are you asleep(Y/N)? : ");
        Scanner sc2 = new Scanner(System.in);
        String asleep = sc2.next();

        boolean result = pickcall(POD,asleep,phone);
        System.out.println(result);

    }

    public static boolean pickcall(String POD, String asleep, String phone){
        if(POD.equals("Morning")  &&  phone.equals("Y") && asleep.equals("N")){
            return true;
        }
        else if(asleep.equals("Y")){
            return false;
        }
        else if(POD.equals("Morning")  &&  phone.equals("N") && asleep.equals("N")){
            return false;
        }
        else{
            return true;
        }
    }
}
