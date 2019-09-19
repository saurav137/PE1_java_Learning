package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class SortAndSum {
    public  void solve ()
    {
        // your code goes here
        System.out.println("You choose 7, Now Enter your string Number to check");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        Vector<Integer> v=new Vector<Integer> ();
        while(num!=0){
            v.add(num%10);
            num/=10;
        }
        Collections.sort(v);
        int sum=0;
        int n=v.size();
        for(int i=0;i<n;i++){

            int a=v.get(i);

            if(a%2==0)
                sum+=a;
        }
        for(int i=n-1;i>=0;i--){

            int a=v.get(i);
            System.out.printf("%d",a);
            if(a%2==0)
                sum+=a;
        }
        System.out.println("");
        if(sum>15)
        {
            System.out.printf("Your sum is %d,",sum);
            System.out.println("True");
        }
        else{
            System.out.printf("Your sum is %d, ",sum);
            System.out.println("False");
        }
    }
}
