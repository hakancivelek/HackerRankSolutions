package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.primeDates;

import java.util.*;
import java.lang.*;

/**
 * This program calculates the number of "lucky dates" between two given dates.
 * A date is considered lucky if the concatenated day, month, and year value is divisible by 4 or 7.
 * The code was provided as part of a debugging challenge with a restriction of making at most 5 changes to fix issues.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

public class Main {
    public static int month[];

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);

        month = new int[15];

        String s = in.nextLine();

        StringTokenizer str = new StringTokenizer(s, "- ");

        int d1 = Integer.parseInt(str.nextToken());
        int m1 = Integer.parseInt(str.nextToken());
        int y1 = Integer.parseInt(str.nextToken());
        int d2 = Integer.parseInt(str.nextToken());
        int m2 = Integer.parseInt(str.nextToken());
        int y2 = Integer.parseInt(str.nextToken());

        int result = findPrimeDates(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
    }

    /**
     * Updates the number of days in February based on whether the given year is a leap year.
     *
     * @param year The year to check for leap year status.
     */
    public static void updateLeapYear(int year) {
        if (year % 400 == 0) {
//            month[2] = 28;
            month[2] = 29;
        } else if (year % 100 == 0) {
//            month[2] = 29;
            month[2] = 28;
        } else if (year % 4 == 0) {
            month[2] = 29;
        } else {
            month[2] = 28;
        }
    }

    /**
     * Initializes the days of each month in a non-leap year.
     */
    public static void storeMonth() {
        month[1] = 31;
        month[2] = 28;
        month[3] = 31;
        month[4] = 30;
        month[5] = 31;
        month[6] = 30;
        month[7] = 31;
        month[8] = 31;
        month[9] = 30;
        month[10] = 31;
        month[11] = 30;
        month[12] = 31;
    }

    /**
     * Finds the number of lucky dates between two given dates.
     *
     * @param d1 Day of the start date.
     * @param m1 Month of the start date.
     * @param y1 Year of the start date.
     * @param d2 Day of the end date.
     * @param m2 Month of the end date.
     * @param y2 Year of the end date.
     * @return The number of lucky dates between the two dates.
     */
    public static int findPrimeDates(int d1, int m1, int y1, int d2, int m2, int y2) {
        storeMonth();

        int result = 0;

        while (true) {
            int x = d1;
            x = x * 100 + m1;
//            x = x * 1000 + y1;
            x = x * 10000 + y1;
            if (x % 4 == 0 || x % 7 == 0) { // (x % 4 == 0 && x % 7 == 0)
                result = result + 1;
            }
            if (d1 == d2 && m1 == m2 && y1 == y2) {
                break;
            }
            updateLeapYear(y1);
            d1 = d1 + 1;
            if (d1 > month[m1]) {
                m1 = m1 + 1;
                d1 = 1;
                if (m1 > 12) {
                    y1 = y1 + 1;
//                    m1 = m1 + 1;
                    m1 = 1;
                }
            }
        }
        return result;
    }
}