package com.knoldus.LeapYear;

import com.knoldus.LargestOfthreeNumbers.LargestOfThree;

import java.util.Scanner;

public class LeapYear {


    public static void isLeapYear(int inputYear) {

        boolean leap = true;

        // if the year is divided by 4
        if (inputYear % 4 == 0) {

            // if the year is century
            if (inputYear % 100 == 0) {

                // if year is divided by 400 then it is a leap year
                if (inputYear % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }


            // if the year is not century
            else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap)
            System.out.println(inputYear + " is a leap year.");
        else
            System.out.println(inputYear + " is not a leap year.");
    }


    public static void main(String[] args) {
        Scanner read_year = new Scanner(System.in);

        //reade input
        System.out.println("input year");
        int year = read_year.nextInt();

        //invoking function
        isLeapYear(year);
    }

}
