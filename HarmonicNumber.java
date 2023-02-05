package com.basicprograms;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String arg[])
    {
        double n,i;
        double sum=0;
        Scanner doublenumber=new Scanner(System.in);
        System.out.println("Enter a number");
        n=doublenumber.nextDouble();
        for( i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("Harmonic value is : "+sum);
    }
}
