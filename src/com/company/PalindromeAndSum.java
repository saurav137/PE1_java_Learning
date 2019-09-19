package com.company;

import java.util.*;
import java.lang.*;
public class PalindromeAndSum {
    public String func(String num) {
        String ans = "";
           if(num==null){
               return "Null Value";
           }
           if(check_validity(num)==true) {
               if (check_palind(num) == true) {

                   int n = num.length() - 1;
                   int sum = 0;
                   // System.out.println("working");
                   while (n >= 0) {
                       char c = num.charAt(n);
                       int x = Character.getNumericValue(c);
                       sum += x;
                       n--;
                   }
                   if (sum > 25) {
                       ans = num + " is Palindrome and sum of even numbers is greater than 25";
                       // System.out.printf("%d is Palindrome and sum of even numbers is greater than 25",num);
                       System.out.println("");
                       return ans;
                   } else {
                       ans = num + " is Palindrome and sum of even numbers is not greater than 25";
                       //   System.out.printf("%d is Palindrome and sum of even numbers is not greater than 25",num);
                       System.out.println("");
                       return ans;
                   }
               } else {
                   ans = num + " is not Palindrome";
                   //     System.out.printf("%d is not palindrome",num);
                   System.out.println("");
                   return ans;
               }
           }
           else{
               return "Not a Valid number";
           }// return ans;

       //return ans;
    }

    public static boolean check_palind(String NumAsStr){
      //  String NumAsStr=Long.toString(num);
      //  String NumAsStr=num;
        int len=NumAsStr.length();
        for(int i=0;i<len/2;i++){
            char a=NumAsStr.charAt(i);
            char b=NumAsStr.charAt(len-1-i);
            if(a!=b){
                return false;
            }

        }
        return true;
    }
    public static boolean check_validity(String NumAsStr){
        //  String NumAsStr=Long.toString(num);
        //  String NumAsStr=num;
        int len=NumAsStr.length();
        for(int i=0;i<len;i++){
            char a=NumAsStr.charAt(i);
           // char b=NumAsStr.charAt(len-1-i);
            if(a>'9' || a<'0'){
                return false;
            }

        }
        return true;
    }
}
