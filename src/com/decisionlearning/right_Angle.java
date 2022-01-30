package com.decisionlearning;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class right_Angle {
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

        if((AB == 90 || BC == 90 || AC==90) && (AB + BC + AC == 180)){
            System.out.println("It is a Right angled triangle");
        }
        else if(AB + BC + AC == 180){
            System.out.println("It is a triangle but not a right angled one ");
        }
        else{
            System.out.println("Not a valid triangle");
        }

    }
}
