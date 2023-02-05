package com.basicprograms;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args)
    {
        Scanner powernumber = new Scanner(System.in);
        System.out.println(" Enter a number:");
        int num = powernumber.nextInt();

        System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
        System.out.println();
        System.out.println("Printing all  Power Values "+num);

        for(int i=1;i<=num;i++)
        {
            System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));
        }
    }
}
