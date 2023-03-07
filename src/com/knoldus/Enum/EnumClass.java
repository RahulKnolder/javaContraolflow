package com.knoldus.Enum;

public class EnumClass {


    enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }


    public static void main(String[] args) {
        //iterating the enum objects
        for (Day index: Day.values()){
            System.out.println(index);
        }
    }
}
