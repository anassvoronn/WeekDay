package org.dz.solution;

public class WeekDayPrinter {
    public void print(final int number){
        if (number >= 7){
            throw new IllegalArgumentException("It's not a day of the week");
        }
        if (number < 0){
            throw new IllegalArgumentException("It's not a day of the week");
        }
        if (number == 0){
            System.out.print("Monday");
        }else if (number == 1){
            System.out.print("Tuesday");
        }else if (number == 2){
            System.out.print("Wednesday");
        }else if (number == 3){
            System.out.print("Thursday");
        }else if (number == 4){
            System.out.print("Friday");
        }else if (number == 5){
            System.out.print("Day off");
        }else if (number == 6){
            System.out.print("Day off");
        }

    }
}
