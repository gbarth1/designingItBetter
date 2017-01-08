package com.company;


import java.util.Scanner;

public class regCust
{
    public regCust(double amt)
    {
        balance = amt;
    }

    public double getBalance()
    {
        return balance;
    }

    public void classCost(int cla)
    {
        cla=10;
    }

    public void retailCost(int ret)
    {
        System.out.println("What is the price  of your purchase");
        Scanner in3= new Scanner(System.in);
        int price=in3.nextInt();
        ret=price;
    }

    public void aquaticsCost(int aqua)
    {
        aqua=0;
    }

    public void ptCost(int pt)
    {
        System.out.print("How many hours are you taking this class for");
        Scanner in4= new Scanner(System.in);
        int hrs=in4.nextInt();
        pt=25*hrs;
    }

    private double balance;
}
