package com.knoldus;
import java.util.Scanner;
public class Calculator {
    void addition()
    {
        int a,b,sum;

        System.out.println("enter two integer value one by one");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
       b=sc.nextInt();
        System.out.println("the sum of "+a+" "+"and "+b+" is "+(a+b));


    }
    void subtract()
    {
        int a,b;

        System.out.println("enter two integer value one by one");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("the difference of "+a+" "+"and "+b+" is "+(a-b));


    }
    void multiplication()
    {
        int a,b;

        System.out.println("enter two integer value one by one");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("the multiplication of "+a+" "+"and "+b+" is "+(a*b));


    }
    void division()
    {
        int a,b;

        System.out.println("enter two integer value one by one");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("the division of "+a+" "+"and "+b+" is "+(a/b));


    }




}
