package com.decisionlearning;

import java.util.Scanner;

public class Strict_increasing_equalOK {
    public static void main(String[] args) {
        System.out.println("Insert A");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Insert B");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();

        System.out.println("Insert C");
        Scanner sc2 = new Scanner(System.in);
        int c = sc2.nextInt();

        System.out.println("Is equalOK true?");
        Scanner sc3 = new Scanner (System.in);
        boolean equalOK = Boolean.parseBoolean(sc3.next());
        boolean result = method(a,b,c,equalOK);
        System.out.println(result);

    }

    public static boolean method(int a, int b, int c,boolean equalOK){
        if(a>b && b>c && !equalOK){
            return true;
        }
        else if((a==b || b==c || c==a) && equalOK){
            return true;

        }
        else return false;

    }
}
