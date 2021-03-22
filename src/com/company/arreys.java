package com.company;

public class arreys   {
    public static void main(String[] args) {
        /* classroom of 500 students you have to store a marks
        you have 2 options:
        1. create 500 variables
        2. use arrays
         */
      //  there are three main ways to create array in java
        // 1.
       // int [] marks = new int[5]; // declaraton + memory allocaton
        // 2.
       // int [] marks;  //declaration
      //  marks = new int[5]; // memory allocation
       /* marks[0] = 100;
        marks[1] = 59;
        marks[2] = 69;
        marks[3] = 79;
        marks[4] = 89;
        System.out.println(marks[3]); */
        // 3.
        int [] marks = { 100,45,63,78,69}; //  declare+initializa+memory allocation
        // in this method of declaring array java itself decides the size of an array
        System.out.println(marks[4]);

    }
}
