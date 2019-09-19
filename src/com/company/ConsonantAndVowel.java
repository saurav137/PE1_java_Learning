package com.company;

import java.util.regex.Pattern;

public class ConsonantAndVowel {
    public String ConsonantAndVowel (String letter)
    {
        // your code goes here
    String ans="";
        int len=letter.length();
        if(valid(letter)==true){
            for (int i = 0; i < len; i++) {
                char ch=letter.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    System.out.print("Vowel ");
                    ans+="Vowel";
                }
                else {
                    System.out.print("Consonant ");
                    ans+="Consonant";
                }
            }
            System.out.println("");
            return ans;
        }
        else {
            System.out.print("Error ");
            return "Error";
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
