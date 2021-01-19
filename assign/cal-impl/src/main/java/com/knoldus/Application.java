package com.knoldus;
import java.util.Scanner;
public class Application {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        Calculator obj=new Calculator();

        do {
            System.out.println("Enter the number 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
             c = sc.nextInt();
            if (c == 1)
                obj.addition();
            else if (c == 2)
                obj.subtract();
            else if (c == 3)
                obj.multiplication();
            else if(c==4)
                obj.division();
        }while(c!=5);




    }
}
