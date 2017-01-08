package com.company;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args)
    {
        System.out.print("How much money do you have in your account?");
        Scanner kb= new Scanner(System.in);
        int bal1=kb.nextInt();

        regCust bill= new regCust(bal1);

        System.out.print("Welcome to the gym! Are you a walk-in, member, or employee?");
        Scanner in= new Scanner(System.in);
        String type=in.next();

        System.out.print("Are you purchasing anything from the retail section or any classes?");
        Scanner in2= new Scanner(System.in);
        String purchase= in2.next();

        if(type.equals("walk-in")){
            System.out.println("Here's your bill:");
        }
    }
}
