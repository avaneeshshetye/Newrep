package com.Recursion;

import java.util.Scanner;

public class lowercasex {
    public static void main(String[] args) {
        String arr[] = {"x","x","r","x"};
        int i=0;
        String x = null;
        int result = calcx(arr,i,x);
        System.out.println(result);



    }

    public static int calcx(String arr[],int i,String x){

        if(i==0 && arr[0]=="x"){

            return 1;
        }
        else if(i==0 && arr[0]!="x") {
            return 1 + calcx(i - 1);
        }
        else if(arr[0]!="x"){
            return 0;
        }


       else {
            return 0+calcx(i-1);
        }
    }

    private static int calcx(int i) {
        return 0;
    }


}

