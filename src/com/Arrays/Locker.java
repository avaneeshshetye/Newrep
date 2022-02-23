package com.Arrays;

import java.util.Scanner;

public class Locker {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int closed = 0;
        int open=0;

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j=j+i){
                if(array[j-1]==0){
                    array[j-1]=1;
                }
                else if(array[j-1]==1){
                    array[j-1]=0;
                }

            }


        }

        for(int j=1;j<=n;j++){
            if(array[j-1]==0){
                System.out.println(j-1 + " Is closed");
                closed++;
            }
            else{
                System.out.println(j-1+" Is open");
                open++;
            }
        }
        System.out.println("Total opened lockers are: " + open);


    }
}

