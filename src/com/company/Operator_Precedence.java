package com.company;

public class Operator_Precedence {
    public static void main(String[] args) {
        //precedence and associativity

        //int a = 6*5-34/2;
        //int b = 60/5-34*2;
        /*    highest precedency goes * to /
        = 12-34*2 // it goes left to right
        = 12-68
        =-56
         */
        //System.out.println(a);
       // System.out.println(b);
        //int x =6;
        //int y = 1;
        int a = 2;
        int c = 6;
        int b = 0;
       // int k = x * y/2;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);

    }
}
