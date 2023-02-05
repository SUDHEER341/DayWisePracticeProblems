package com.basicprograms;
import java.util.Scanner;

public class ConsonantOrVowel {
    public static void main(String[] args)
    {
        char ch;
        Scanner alphabet = new Scanner(System.in);

        System.out.print("Enter an Alphabet: ");
        ch = alphabet.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            System.out.println( ch +" It is a Vowel");
        else
            System.out.println( ch + " It is a Consonant");
    }
}
