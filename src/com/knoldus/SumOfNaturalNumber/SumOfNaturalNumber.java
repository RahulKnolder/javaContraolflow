package com.knoldus.SumOfNaturalNumber;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static int sumOfNaturalNumber(int input_nth_Number) {
        int numberCount = 1;
        int sum = 0;

        //while loop
        while (numberCount <= input_nth_Number) {
            sum = sum + numberCount;
            numberCount++;
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner readNumber = new Scanner(System.in);


        //read input from user
        System.out.println("Enter the nth number ");
        int input_nth_Number = readNumber.nextInt();

        //object calling
        System.out.println(sumOfNaturalNumber(input_nth_Number));
    }

}
