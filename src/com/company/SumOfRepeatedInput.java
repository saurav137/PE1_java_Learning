package com.company;

import java.util.Scanner;

public class SumOfRepeatedInput {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String num;
        int flag = 0;
        System.out.println("Enter a String ");
        num = sc.nextLine();
        System.out.println(num);
        String[] str = num.split(" ");
        //int flag=0;
        for (String n : str) {
            if (check_validity(n) == true) {
                sum += Integer.parseInt(n);
            } else {
                flag=1;
                break;
            }

        }
        if(flag==0)
            System.out.println(sum);

    }

    // write your code here

    public static boolean check_validity(String input1) {
        try {

            Integer.parseInt(input1);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Not a valid number");
            return false;
        }

    }
}
