package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthYear, birthMonth, birthDay,
                currentYear, currentMonth, currentDay
                , ageYear, ageMonth, ageDay;
        System.out.println("Enter birthdate");
        System.out.print("enter year: "); birthYear = scanner.nextInt();
        System.out.print("enter mount: "); birthMonth = scanner.nextInt();
        System.out.print("enter day: "); birthDay = scanner.nextInt();
        System.out.println("enter current date");
        System.out.print("enter year: "); currentYear = scanner.nextInt();
        System.out.print("enter mount: "); currentMonth = scanner.nextInt();
        System.out.print("enter day: "); currentDay = scanner.nextInt();
        // calculate age...
        ageYear = currentYear - birthYear;
        ageMonth = currentMonth - birthMonth;
        if (ageMonth < 0) {
            ageMonth=ageMonth+12;
            ageYear--;
        }
        ageDay = currentDay - birthDay;
        if (ageDay < 0) {
            ageDay=ageDay+30;
            ageMonth--;
        }
        System.out.println("your age is ->"+ ageYear +"/"+ ageMonth+ "/"+ ageDay);
    }
}
