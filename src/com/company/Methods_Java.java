package com.company;

public class Methods_Java {
    /*static*/ int logic(int x, int y){
        // if we dont use static here we need to take object of given class
        int z;
        if (x>y){
            z = x+y;
        }else
            {
           z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        // if we dont have to return anything from methods then we use void
        int a = 5;
        int b = 6;
        int c;
        Methods_Java obj = new Methods_Java();
        c = obj.logic(a,b);
        //c = logic(a,b);//this method is associate with static in method name.
        // and if there is no static we have to make an object
        System.out.println(c);
        int a1 = 45;
        int b1 = 60;
        int c1;
        c1 = obj.logic(a1,b1);
        System.out.println(c1);
    }
}
