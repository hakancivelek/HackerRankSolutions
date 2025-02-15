package com.hakancivelek.java.exceptionHandling.javaExceptionHandlingTryCatch;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int number1 = in.nextInt();
            int number2 = in.nextInt();

            System.out.println(number1 / number2);
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}

