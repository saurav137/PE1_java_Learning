package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void solve() {
        // write your code here
        System.out.println("You choose 8, Now the game begins....");
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int input=0;
        int rand_int1 = rand.nextInt(101);
        while(true){
            input=sc.nextInt();
            if(input>rand_int1){
                System.out.println("You are going far, slow down Mate !");
            } else if(input<rand_int1){
                System.out.println("Speed up, Man!!");
            }
            else{
                System.out.println("Hurrah, You guessed it right!!");
                break;
            }
            // input=
        }

    }

}
