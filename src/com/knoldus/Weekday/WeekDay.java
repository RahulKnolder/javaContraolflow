package com.knoldus.Weekday;

import java.util.Scanner;

public class WeekDay {


   public static void getDay(int daySequence){

       //switch statement
        switch (daySequence) {
            case 1:
                System.out.println("Sundya");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
    public static void main(String[] args) {

       //read input form user
        Scanner readDaysequence= new Scanner(System.in);
        System.out.println("enter the sequence of day ");
        int daySequence=readDaysequence.nextInt();

      // invoke function
       getDay(daySequence);
    }
}
