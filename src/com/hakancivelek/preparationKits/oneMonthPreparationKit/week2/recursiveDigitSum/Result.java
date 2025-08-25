package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.recursiveDigitSum;

/**
 * Result class provides the method to calculate the super digit of a number
 * formed by repeating a number n, k times.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>/
 **/
class Result {
    /**
     * Calculates the super digit of a number formed by repeating n, k times.
     * <p>
     * The super digit is calculated by first summing the digits of the given string n,
     * then multiplying the sum by k, and recursively calculating the sum of digits
     * until a single-digit result is obtained.
     *
     * @param n A string representing the number.
     * @param k The number of times n is concatenated.
     * @return The super digit of the number formed by repeating n, k times.
     */
    public static int superDigit(String n, int k) {
        long sum = 0;

        for (char c : n.toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        return recursiveSuperDigit(sum * k);
    }

    /**
     * Recursively calculates the super digit of a number by summing its digits until a single-digit result is obtained.
     *
     * @param num The number whose super digit is to be calculated.
     * @return The super digit of the number.
     */
    private static int recursiveSuperDigit(long num) {
        if (num < 10) return (int) num;

        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return recursiveSuperDigit(sum);
    }
}
