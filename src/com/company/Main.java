package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;


/*
class Ideone1
{
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


class Ideone2
{
    public  void solve (int num)
    {
        // your code goes here

        if(num<=30 && num>=20){
            if(num%2==0){
                System.out.println("Jerry");
            }
            else{
                System.out.println("Tom");
            }
        }
        else{
            System.out.println("OOPS!! Number is out of range");
        }

    }
}

class Ideone3
{
    public void charachter_check (String letter)
    {
        // your code goes here

        int len=letter.length();
        if(valid(letter)==true){
            for (int i = 0; i < len; i++) {
                char ch=letter.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    System.out.print("Vowel ");
                }
                else {
                    System.out.print("Consonant ");
                }
            }
            System.out.println("");
        }
        else {
            System.out.print("Error ");
        }

    }
    public static boolean valid(String  s){
        if (Pattern.matches("[a-zA-Z]+",s)) {
            // Do something
            return true;
        }else{
            return false;
        }



    }
}

class Ideone4
{
    public  void solve (int n)
    {
        // your code goes here

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",i);
            }
        }

    }
}

class Ideone5 {

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

class Ideone6
{
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


class Ideone7
{
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
             System.out.printf("You sum is %d,",sum);
            System.out.println("True");
        }
        else{
            System.out.printf("You sum is %d, ",sum);
            System.out.println("False");
        }
    }
}



class Ideone8 {

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

class Ideone9 {
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

class Ideone10
{
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
*/

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            while(true) {
                System.out.println("What do you want me to do ? ");
                System.out.println(" Enter the question number");
                System.out.println("Or press 0 to exit. ");
                int n = sc.nextInt();
                if (n == 0)
                    break;
                if(n==1){
                    System.out.println("You choose 1, Now Enter your  number....");
                    Long num=sc.nextLong();
                    Ideone1 obj=new Ideone1();
                    obj.func(num);
                    System.out.println("");
                }
                else if(n==2){

                    System.out.println("You choose 2, Now Enter your  number....");
                    int num = sc.nextInt();
                    Ideone2 obj = new Ideone2();
                    obj.solve(num);
                }
                else if (n == 3) {
                    System.out.println("You choose 3, Now Enter the word....");

                    String s = sc.next();
                    Ideone3 obj = new Ideone3();
                    obj.charachter_check(s);

                }

                else if(n==4){
                    System.out.println("You choose 4, Now Enter your Number to draw a cool pattern..");
                    int num = sc.nextInt();
                    Ideone4 obj = new Ideone4();
                    obj.solve(num);
                }
                else if(n==5){
                    System.out.println("You choose 5, Now Enter your string input");

                    Ideone5 obj = new Ideone5();
                    obj.solve();
                    System.out.println("");
                }
                else if(n==6){

                    Ideone6 obj=new Ideone6();
                    obj.solve();
                    System.out.println("");
                }
                else if(n==7){
                    Ideone7 obj=new Ideone7();
                    obj.solve();
                    System.out.println("");
                }
                else if(n==8){
                    Ideone8 obj=new Ideone8();
                    obj.solve();
                    System.out.println("");
                }
                else if(n==9){
                    Ideone9 obj=new Ideone9();
                    obj.solve();
                    System.out.println("");
                }
                else if(n==10){
                    Ideone10 obj=new Ideone10();
                    obj.solve();
                    System.out.println("");
                }




            }
	// write your code here
    }

}