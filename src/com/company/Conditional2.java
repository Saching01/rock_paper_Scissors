package com.company;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class Conditional2 {
    public static void main(String[] args) {
        System.out.println("Enter your Age");
        Scanner ag = new Scanner(System.in);
        int a = ag.nextInt();
        //char var; // to use character in switch
        switch(a){
            case 18:
            System.out.println("you are going to adult");
            break;

            case 25:
                System.out.println("you are going to job");
                break;

            case 60:
                System.out.println("you are get retired");
                break;

            default:
                System.out.println("Enjoy your life");
        }
    }
}
