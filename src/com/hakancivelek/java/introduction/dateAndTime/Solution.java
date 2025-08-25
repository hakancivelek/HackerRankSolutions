package com.hakancivelek.java.introduction.dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * A solution to determine the day of the week for a given date.
 * The user inputs a date as month, day, and year, and the program outputs the corresponding day in uppercase letters.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        scanner.close();

        String res = findDay(month, day, year);

        System.out.println(res);
    }

    /**
     * Determines the day of the week for a given date.
     *
     * @param month The month of the date (1-12).
     * @param day   The day of the month (1-31, depending on the month).
     * @param year  The year of the date.
     * @return The name of the day in uppercase (e.g., "MONDAY", "TUESDAY").
     */
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.name();
    }
}
