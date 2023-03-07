package com.knoldus.kup.evenODd;

import java.util.Scanner;

public class EvenOdd {


    //function for even odd
    static String odd_even(int inputNUmber) {
        if (inputNUmber % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }


    public static void main(String[] args) {

        //reading input from the user
        Scanner read_number = new Scanner(System.in);
        int inputNUmber = read_number.nextInt();

        //function call
        System.out.println(odd_even(inputNUmber));
    }


}
