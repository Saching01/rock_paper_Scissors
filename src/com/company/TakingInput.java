package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TakingInput {
     public static void main(String[] args) {
         System.out.println("Taking input from users");
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number One");
         //float a = sc.nextFloat();
         int a = sc.nextInt();
         System.out.println("Enter number two");
        // float b = sc.nextFloat();
         int b = sc.nextInt();

         int sum = a+b;
         System.out.print(" the sum is : "+ sum);
         //System.out.println();
       // boolean m = sc.hasNextInt();
         //System.out.println(m);
       //  String str = sc.nextLine();
       //  System.out.println(str);
     }
}
