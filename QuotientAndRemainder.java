package com.basicprograms;
import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers ");
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("After division  Quotient and Remainder are:");
        System.out.println("The Quotient is: " + quotient);
        System.out.println("The Remainder is: " + remainder);
    }
}
