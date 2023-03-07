package com.knoldus.PositiveNegative;

import java.util.Scanner;

public class PositiveNegative {


    public static String isPositiveNegative(int inputNumber) {
        //nested if wasn't required but, it  was mentioned, so we did it
        if (inputNumber > 0 || inputNumber == 0) {
            if (inputNumber > 0) {
                return "number is positive";
            } else {
                return "number is zero";
            }
        } else {
            return "number is negative";
        }
    }


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please inter the number you want to");
        int inputNUmber = reader.nextInt();


        System.out.println(isPositiveNegative(inputNUmber));
    }
}
