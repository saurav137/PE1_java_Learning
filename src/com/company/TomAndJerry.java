package com.company;

public class TomAndJerry {
    public String solve (int num)
    {
        // your code goes here

        if(num<=30 && num>=20){
            if(num%2==0){
                System.out.println("Jerry");
                return "Jerry";
            }
            else{
                System.out.println("Tom");
                return "Tom";
            }
        }
        else{
            System.out.println("OOPS!! Number is out of range");
            return "OOPS!! Number is out of range";
        }

    }
}

