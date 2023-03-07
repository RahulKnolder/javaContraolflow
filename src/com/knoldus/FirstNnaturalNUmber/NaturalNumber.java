package com.knoldus.FirstNnaturalNUmber;

import java.util.Scanner;

public class NaturalNumber {


    //method to to print n natural number
    void naturalNumber(int number) {
       int numberCount=1;

       //while loop
      while(numberCount<=number){
          System.out.println(numberCount);
          numberCount++;
      }


    }

    public static void main(String[] args) {

        Scanner readnumber = new Scanner(System.in);
        int last_number = readnumber.nextInt();


        NaturalNumber natura = new NaturalNumber();
        natura.naturalNumber(last_number);
    }
}
