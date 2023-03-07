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
        for (Day index: Day.values()){
            System.out.println(index);
        }
    }
}
