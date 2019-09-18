package com.company;

import java.util.*;
import java.lang.*;
public class Ideone1 {
    public  void func (long num)
    {


        if(check_palind(num)==true){

            long x=num;
            int sum=0;
            while(x!=0){
                sum+=x%10;
                x/=10;
            }
            if(sum>25){
                System.out.printf("%d is Palindrome and sum of even numbers is greater than 25",num);
                System.out.println("");
            }
            else{
                System.out.printf("%d is Palindrome and sum of even numbers is not greater than 25",num);
                System.out.println("");
            }
        }
        else {
            System.out.printf("%d is not palindrome",num);
            System.out.println("");
        }
    }

    public static boolean check_palind(long num){
        String NumAsStr=Long.toString(num);
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
}
