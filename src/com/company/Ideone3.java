package com.company;

import java.util.regex.Pattern;

public class Ideone3 {
    public void charachter_check (String letter)
    {
        // your code goes here

        int len=letter.length();
        if(valid(letter)==true){
            for (int i = 0; i < len; i++) {
                char ch=letter.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    System.out.print("Vowel ");
                }
                else {
                    System.out.print("Consonant ");
                }
            }
            System.out.println("");
        }
        else {
            System.out.print("Error ");
        }

    }
    public static boolean valid(String  s){
        if (Pattern.matches("[a-zA-Z]+",s)) {
            // Do something
            return true;
        }else{
            return false;
        }



    }
}
