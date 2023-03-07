package com.knoldus.Grades;

import java.util.Scanner;

public class Grade {



    //grade function
    public static void gradeCalculator(double percentage) {

        if(percentage <= 100 ){
            if(percentage > 90 && percentage <= 100) {
                System.out.println("A+");
            }
            if(percentage > 80 && percentage <= 90) {
                System.out.println("A");
            }
            if(percentage > 70 && percentage <= 80) {
                System.out.println("B");
            }
            if(percentage > 60 && percentage <= 70) {
                System.out.println("C");
            }
            if(percentage > 50 && percentage <= 60) {
                System.out.println("D");
            }
            else {
                System.out.println("poor garde");
            }
        }
        else{
            System.out.println("invalid input");
        }
    }




    public static void main(String[] args) {

        Scanner readPercentage= new Scanner(System.in);
        int percentage = readPercentage.nextInt();




        gradeCalculator(percentage);
    }
}
