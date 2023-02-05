package com.basicprograms;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args)
    {
        int first_number, second_number, third_number;
        Scanner intnumber = new Scanner(System.in);
        System.out.print("Enter the first number:");
        first_number = intnumber.nextInt();
        System.out.print("Enter the second number:");
        second_number = intnumber.nextInt();
        System.out.print("Enter the third number:");
        third_number = intnumber.nextInt();
        if(first_number > second_number && first_number > third_number)
        {
            System.out.println("Largest number is:"+first_number);
        }
        else if(second_number > third_number)
        {
            System.out.println("Largest number is:"+second_number);
        }
        else
        {
            System.out.println("Largest number is among three numbers is :"+third_number);
        }

    }
}
