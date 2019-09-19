package com.company;

import java.util.Scanner;

public class CharacterCheck {
    public String solve (char ch )
    {

        //Scanner sc = new Scanner(System.in);

    //    System.out.println(ch);

        if (ch>=65 && ch<=90){
            System.out.println("Character is a Capital letter");
           return "Character is a Capital letter";}
        else if (ch>=97 && ch<=122){
            System.out.println("Character is a small letter");
           return "Character is a small letter";}
        else if (ch>=48 && ch<=57) {
            System.out.println("Character is a digit");
            return "Character is a digit";
        }
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
                (ch>=91 && ch<=96)||(ch>=123 && ch<=127)) {
            System.out.println("Character is a special");
            return "Its a Special Character";

        }
        else return null;
    }
}
