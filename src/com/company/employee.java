package com.company;

import java.util.Scanner;

public class employee extends regCust
{
    public employee(double amountE)
    {
        super(amountE);
    }

    public void classCostE()
    {
        double eCla=3;
        classCost((int) eCla);
    }

    public void retailCostE()
    {
        System.out.println("What is the price  of your purchase");
        Scanner in3= new Scanner(System.in);
        int price=in3.nextInt();
        double eRet= price - (price * 1/10);
        retailCost((int) eRet);

    }

    public void aquaticsCostE()
    {
        double eAqua=7;
        aquaticsCost((int)eAqua);
    }

    public void ptCostE()
    {
        System.out.print("How many hours are you taking this class for");
        Scanner in4= new Scanner(System.in);
        int hrs=in4.nextInt();
        double ePT=15 * hrs;
        ptCost((int)ePT);
    }
}
