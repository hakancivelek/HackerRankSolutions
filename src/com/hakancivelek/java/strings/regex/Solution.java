package com.hakancivelek.java.strings.regex;

import java.util.Scanner;

/**
 * Solution class that reads IP addresses from input and checks their validity.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();

        while (in.hasNext()) {
            String ip = in.next();
            System.out.println(myRegex.isValidIP(ip));
        }
    }
}