package com.hakancivelek.preparationKits.week1.timeConversion;

/**
 * This class provides a method to convert a given 12-hour AM/PM formatted time string
 * into a 24-hour (military) time format.
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Converts a given time from 12-hour AM/PM format to 24-hour format.
     *
     * <p>Rules:
     * <ul>
     *   <li>"12:00:00AM" (midnight) is converted to "00:00:00".</li>
     *   <li>"12:00:00PM" (noon) remains "12:00:00".</li>
     *   <li>Any other AM time remains the same except "AM" is removed.</li>
     *   <li>For PM times (except 12 PM), 12 is added to the hour value.</li>
     * </ul>
     *
     * @param s A string representing time in 12-hour format (hh:mm:ssAM or hh:mm:ssPM).
     * @return A string representing the time in 24-hour format (HH:mm:ss).
     */
    public static String timeConversion(String s) {
        String hours = (s.substring(0, 2));
        String minutes = (s.substring(3, 5));
        String seconds = (s.substring(6, 8));

        if(s.contains("P") && !hours.equals("12")){
            hours = Integer.toString((Integer.parseInt(hours) + 12));
        } else if(s.contains("A") && hours.equals("12")){
            hours = "00";
        }
        return hours + ":" + minutes + ":" + seconds;
    }
}
