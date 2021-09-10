/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;
import java.util.Calendar;

public class RetirementCalculator {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("What is your current age?");
        Scanner input = new Scanner(System.in);
        String CurrentAgeString = input.nextLine();
        int CurrentAge = Integer.parseInt(CurrentAgeString);

        System.out.println("At what age would you like to retire?");
        String RetireAgeString = input.nextLine();
        int RetireAge = Integer.parseInt(RetireAgeString);

        int YearsLeft = RetireAge - CurrentAge;
        System.out.println("You have " + YearsLeft + " years left until you can retire.");

        int RetireYear = year + YearsLeft;
        System.out.println("It's " + year + ", so you can retire in " + RetireYear + ".");
    }
}
