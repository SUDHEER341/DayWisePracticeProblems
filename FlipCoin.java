package com.basicprograms;
import java.util.Scanner;

public class FlipCoin {
    static void flipCoin(int n)
    {
        int numOfflips = n;
        int i,countHeads,countTails ;
        i = countHeads =countTails = 0;
        while(i < numOfflips )
        {
            byte randomNum = (byte)(Math.random() * 2);
            System.out.println(randomNum);
            int count = randomNum==1 ? countHeads++ : countTails++ ;


            // if (randomNum==1) {countHeads++;}
            //else { countTails++;}
            i++;
        }
        //heads = h_cnt / (double) n * 100;
        System.out.println("number of heads "+countHeads);
        System.out.println("number of heads percentage  "+countHeads/(double)numOfflips*100 +"%");
        System.out.println("number of tails "+countTails);
        System.out.println("number of heads percentage  "+countTails/(double)numOfflips*100 +"%");



    }
    public static void main(String[] args) {
        System.out.println("Enter the number of flips");
        Scanner Flip =new Scanner(System.in);
        int n = Flip.nextInt();
        flipCoin(Math.abs(n));
        ;
    }
}
