package com.company;

import java.util.Scanner;

public class Ideone6 {
    public  void solve ( )
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("You choose 6, Now Enter the letter you want to check.");
        // Character input
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        if (ch>=65 && ch<=90)
            System.out.println("Character is a Capital letter");
        else if (ch>=97 && ch<=122)
            System.out.println("Character is a small letter");
        else if (ch>=48 && ch<=57)
            System.out.println("Character is a digit");
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
                (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
            System.out.println("Character is a special");
    }
}
