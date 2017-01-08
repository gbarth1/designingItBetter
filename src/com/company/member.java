package com.company;

import java.util.Scanner;

public class member extends regCust
{
    public member(double amount)
    {
        super(amount);
    }

    public void classCostM()
    {
        double mCla=8;
        classCost((int) mCla);
    }

    public void retailCostM()
    {
        System.out.println("What is the price  of your purchase");
        Scanner in3= new Scanner(System.in);
        int price=in3.nextInt();
        double mRet= price - (price * 1/5);
        retailCost((int) mRet);

    }

    public void aquaticsCostM()
    {
        double mAqua=10;
        aquaticsCost((int)mAqua);
    }

    public void ptCostM()
    {
        System.out.print("How many hours are you taking this class for");
        Scanner in4= new Scanner(System.in);
        int hrs=in4.nextInt();
        double mPT=20 * hrs;
        ptCost((int)mPT);
    }
}
