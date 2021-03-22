package com.company;

import java.util.Locale;

public class Practice_String {
    public static void main(String[] args) {
        //Problem 1
        String name = "Sachin Gunjal";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2
        String text  ="To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        //Problem 3
        String letter = "Dear <|name|>, Thanks a lot";
       letter =  letter.replace("<|name|>", "Sachin");
        System.out.println(letter);

        //Problem 4
        String MyString = "this string contain double  and triple   spaces";
        System.out.println(MyString.indexOf("  "));
        System.out.println(MyString.indexOf("      "));
       // System.out.println(MyString);

        //ENOUGH
    }

}
