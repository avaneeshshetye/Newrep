package com.Recursion;

public class xTOy {
    public static void main(String[] args) {

        String var = "xxvnffjyxwxx";
        String x;
        int result = find_X(var);
        System.out.println(result);

    }

    public static int find_X(String var) {


        if (var.length() == 0) {
            return 0;
        }


        if (var.charAt(var.length() - 1) == 'x') {
            return 1 + find_X(var.substring(0, var.length() - 1)); //
        } else {
            return find_X(var.substring(0, var.length() - 1));
        }


    }
}