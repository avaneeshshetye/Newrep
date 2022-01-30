package com.decisionlearning;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Enter first side of the triangle: ");
        Scanner sc1 = new Scanner(System.in);
        int AB = sc1.nextInt();
        System.out.println(AB + " " + "Degrees");

        System.out.println("Enter second side of the triangle: ");
        Scanner sc2 = new Scanner(System.in);
        int BC = sc1.nextInt();
        System.out.println(BC + " " + "Degrees");

        System.out.println("Enter third side of the triangle: ");
        Scanner sc3 = new Scanner(System.in);
        int AC = sc1.nextInt();
        System.out.println(AC + " " + "Degrees");

        if(AB + BC + AC == 180){
            System.out.println("It is a valid triangle");
        }

        else{
            System.out.println("Not a valid triangle");
        }






    }

}
