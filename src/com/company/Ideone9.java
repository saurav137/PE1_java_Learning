package com.company;

import java.util.Scanner;

public class Ideone9 {
    public void solve ()
    {
        // your code goes here
        System.out.println("You choose 9, Now Enter your string to reverse");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder string = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            string.append(str.charAt(i));
        }


        System.out.println(string.toString());

    }
}
