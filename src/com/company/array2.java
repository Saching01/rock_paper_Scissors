package com.company;

public class array2 {
    public static void main(String[] args) {
        //array length
       // int [] marks = {78,65,67,32,98};
        float [] marks = {78,65,98,32,65,0.89f};
        String [] student = {"sachin", "Sanket","Satish","siddharth"};
      //  System.out.println(student[3]);
     //   System.out.println(marks[3]);
       // System.out.println(marks.length);

        //desplaing array / traversal array
        for (int i=0; i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("in reverse order");
//displaying array in reverse order
        for (int i= marks.length - 1; i>=0;i--)
        {
            System.out.println(marks[i]);
        }
        //displaying array in for each loop
        System.out.println("in another method");

        for (float element: marks){
            System.out.println(element);
        }
    }
}
