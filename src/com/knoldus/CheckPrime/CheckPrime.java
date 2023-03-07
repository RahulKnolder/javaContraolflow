package com.knoldus.CheckPrime;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class CheckPrime {
    public static void isPrime(int inputNumber) {

        int CountOfNumbers = 1;
        int count = 0;
        do {
            if ((inputNumber != 2) && (inputNumber % CountOfNumbers == 0)) {
                count++;
            }
            CountOfNumbers++;
        }
        while (CountOfNumbers <= inputNumber);


        if (count > 2) {
            System.out.println("number not prime");
        } else {
            System.out.println("numner is prime");
        }

    }

    public static void main(String[] args) {

        Scanner readernumebr = new Scanner(System.in);

        //read input
        System.out.println("Input the number you want to check");
        int inputNumber = readernumebr.nextInt();

        // invoke function
        isPrime(inputNumber);
    }
}
