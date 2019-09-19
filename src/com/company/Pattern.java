package com.company;

public class Pattern {

    public String solve_Pattern(int n)
    {
        // your code goes here
     String ans="";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",i);
                ans+=Integer.toString(i);
            }
        }
        return  ans;

    }
}

