package com.decisionlearning;

import java.util.Scanner;

public class BOK {
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

        System.out.println("Is BOK true?");
        Scanner sc3 = new Scanner (System.in);
        boolean BOK = Boolean.parseBoolean(sc3.next());

        boolean result = method(a,b,c,BOK);
        System.out.println(result);
    }
    public static boolean method(int a, int b, int c, boolean BOK){
        if(b>a && c>b && !BOK){
            return true;
        }
        else return c > b && BOK;
    }

}
