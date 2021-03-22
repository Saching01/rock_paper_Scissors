package com.company;

import java.util.Locale;

public class String2 {
    public static void main(String[] args) {
        String a = "harry";
       // String a1 = new String("harry");
        System.out.println(a);
        int value = a.length();
        System.out.println(value);
        String lstring = a.toLowerCase();
        System.out.println(lstring);
        String ustring = a.toUpperCase();
        System.out.println(ustring);
        String nonTrimString = "      hary ";
        System.out.println(nonTrimString.trim());
        System.out.println( a.substring(3));
        System.out.println( a.substring(2,4));
        System.out.println( a.replace('r', 'p'));
 //and there are many more..

    }
}
