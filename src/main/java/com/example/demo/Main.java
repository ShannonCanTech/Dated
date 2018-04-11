package com.example.demo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);


        //LocalDate & LocalTime 101
        //A LocalDate is a date with a year, month, and day of the month.
        //To construct a LocalDate, use the "now" or "of" static method.
        //Some LocalDate objects:
        // now, of - static methods used to construct a LocalDate from either the current time or from a given year, month, and day.
        //plusDays, plusWeeks, plusMonths, plusYears - Adds a number of days, week,s months, or years from the LocalDate
        //minusDays, minusWeek, minusMonth, minusYears - Subtracts a number of days, week, months, or years from the LocalDate
        //withDayOfMonth, withDayOfYear, withMonth, withYear - Returns a new LocalDate with the day of month, day of year, month, or year changed to a new value.
        //getDayOfMonth, getDayOfYear, getDayOfWeek, getMonth, getMonthValue, getYear - Gets day of the month between 1 and 31; gets day of the year between 1 and 366; gets day of the week by returning a value of DayOfWeek enumeration

        //compareTo() method
        //Similar to .equals() method
        //The compareTo() method tells you whether one string comes before another in "dictionary" order


        //Gets the current time
        LocalDateTime rightNow = LocalDateTime.now(); //To construct a LocalDate, use the "now" or "of" static method.

        //Get date from the user
        LocalDate userDate = null;  //A LocalDate is a date with a year, month, and day of the month.

        //Just added
        LocalDate thisIsMyDate = null;

        //This is for formatting so you can use this later
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter shortMonthFormat = DateTimeFormatter.ofPattern("dd MM yyyy");
        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        DateTimeFormatter nameDayOfWeek = DateTimeFormatter.ofPattern("dd");

        //Time formatting
        DateTimeFormatter hr24 = DateTimeFormatter.ofPattern("kk:m");

        //Output's today's date in formats that have been preset
        System.out.println("This is the current date: " + rightNow.format(longFormat));
        System.out.println("This is the current system time (24 h format): " + LocalTime.now());


        //This is how you will parse a string with a date time formatter (dTF)
        String aDate = "22/05/2010";
        userDate = LocalDate.parse(aDate, dTF);
        System.out.println(userDate.format(longFormat)); //This will output "22 May 2010"

        //Display date entered
        System.out.println(userDate.format(shortMonthFormat)); //This will output "22 05 2010"

        System.out.println(userDate.format(nameDayOfWeek)); //I added this to find the day of the week. This will output 22.

        //Just added
        System.out.println("Enter a day: ");
        String thisDay = keyboard.nextLine();
        DayOfWeek newDay = DayOfWeek.of(Integer.parseInt(thisDay));

        System.out.println("Enter a date in the format dd/MM/yyyy");
        String enterDate = keyboard.nextLine();
        DayOfWeek thisIsANewDay = DayOfWeek.of(Integer.parseInt(enterDate));
        Year thisIsANewYear = Year.of(Integer.parseInt(enterDate));
        Month thisIsANewMonth = Month.of(Integer.parseInt(enterDate));
        thisIsMyDate = LocalDate.parse(enterDate, shortMonthFormat);
        System.out.println(thisIsMyDate.format(shortMonthFormat));


        System.out.println("Now enter the year");
        String thisYear = keyboard.nextLine();
        Year newYear = Year.of(Integer.parseInt(thisYear)); //Converts the user's input to an integer and stores the value into newYear


        //Just added. This will tell the user the date format.

        //Just added. This will prompt the user to enter a date.

        //This will output the day of the week.

        //This will output the name of the Month the user's inputted date falls on

        //This will tell the user if the date they entered is a future or past date.


        System.out.println("This is the year entered: "+newYear); //Value of newYear collected from the user's input of thisYear

        //Just added
        System.out.println("This is the day of the week entered: "+newDay); //This will output either Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday

        System.out.println("Day you entered "+thisIsANewDay);
        System.out.println("Year you entered "+thisIsANewYear);
        System.out.println("Month you entered: " +thisIsANewMonth);
    }
}
