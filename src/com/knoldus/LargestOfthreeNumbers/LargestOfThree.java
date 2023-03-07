package com.knoldus.LargestOfthreeNumbers;

import java.util.Scanner;

public class LargestOfThree {
    static int largestOfthree(int firstNumbere, int secondNumber, int thirdNumber) {

        //comparing a and b and storing the largest number in a temp variable
        int temproryNUmber = firstNumbere > secondNumber ? firstNumbere : secondNumber;

        //comparing the temp variable with c and storing the result in the variable
        int largest = thirdNumber > temproryNUmber ? thirdNumber : temproryNUmber;

        return largest;
    }


    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        //reading input from the user
        System.out.println("Enter the first number:");
        int firstNumbere = scannerObject.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scannerObject.nextInt();

        System.out.println("Enter the third number:");
        int thirdNumber = scannerObject.nextInt();


        // function call
        System.out.println(largestOfthree(firstNumbere, secondNumber, thirdNumber));
    }
}