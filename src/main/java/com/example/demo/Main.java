package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);


        //Gets the current time
        LocalDateTime rightNow = LocalDateTime.now();

        //Get date from the user
        LocalDate userDate = null;

        //This is for formatting so you can use this later
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter shortMonthFormat = DateTimeFormatter.ofPattern("dd MM yyyy");
        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        //Time formatting
        DateTimeFormatter hr24 = DateTimeFormatter.ofPattern("kk:m");

        //Output's today's date in formats that have been preset
        System.out.println("This is the current date: " + rightNow.format(longFormat));
        System.out.println("This is the current system time (24 h format): " + LocalTime.now());


        //This is how you will parse a string with a date time formatter (dTF)
        String aDate = "22/05/2010";
        userDate = LocalDate.parse(aDate, dTF);
        System.out.println(userDate.format(longFormat));


        //Display date entered
        System.out.println(userDate.format(shortMonthFormat));

        System.out.println("Now enter the year");
        String thisYear = keyboard.nextLine();
        Year newYear = Year.of(Integer.parseInt(thisYear));


        System.out.println("This is the year entered: "+newYear);
    }
}
