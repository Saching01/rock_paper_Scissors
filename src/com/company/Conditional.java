package com.company;
import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        System.out.println("Enter your Age");
        Scanner ag = new Scanner(System.in);
        int a = ag.nextInt();
        if (a>18 && a<25){
            System.out.println("Haa chal..... Aala motha Shahana");
        }

       else if(a>25){
            System.out.println("beeeteeeeee ooo bsdk bete mauj kardii  Tam to bade Heavy driver nikle bete");
        }
        else
            {
                System.out.println("Uter Adhi Tya Gaditun..... Chal nigh baher");
            }
    }
}
