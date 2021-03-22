package com.company;

public class Resulting_dataType {
    public static void main(String[] args) {
        /* b ->byte f->float s->short d->double i->int c->character l->long
        R =  b+s=int
          = s+i = int
          = l+f = float
          = i+f = float
          = c+i = int
          = c+s= int
          = l+d = double
          = f+d = double

        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y+ z;
        float b = 6.5f + x;
        System.out.println(b);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
*/
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a );

    }
}
