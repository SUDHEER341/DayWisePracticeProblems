package com.basicprograms;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number to check even or odd : ");

        Scanner reader = new Scanner(System.in);

        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even number");

        else
            System.out.println(num + " is odd number");
    }
}
