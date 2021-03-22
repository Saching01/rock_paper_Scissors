package com.company;
//two or more methods can have same name but different parameters
public class Methods_overloading {
    static void foo(){
        System.out.println("I love you");
    }// in method overloading we can only change the arguments not the void.
    // in case we change void into int and gives the return value , then also it will not work out
    static void foo(int a){
        System.out.println("I love you "+a);
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tell_joke()
    {
        System.out.println(" I invented one word\n" + " plagiarism!!");
    }
    public static void main(String[] args) {

        //tell_joke();
    //int [] marks = {12,566,65,32,56,98};
    //case 1:changing the integer
   // int x = 45
        // change(x);
    //    System.out.println("the value of x after chang is- " +x);

        //case 2:changing the array
         //int x = 45;
        // change2(marks);
        //System.out.println("the value of x after chang is- " +marks[0]);
        foo();
        foo(3000);// a is parameter and 3000 is argument(are actuals)
    }
}
