package com.company;

import java.util.Scanner;

public class NthStringRepeat {
    public void solve ()
    {
        // your code goes here
        System.out.println("You choose 10, Now Enter your string to repeat...");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n=sc.nextInt();
        if(str.length()>n){
            String newl=str.substring(str.length()-n);
            System.out.print(str);
            for(int i=0;i<n-1;i++)
                System.out.print(newl);
        }
        else {
            for(int i=0;i<n;i++)
                System.out.print(str);
        }

    }
}
