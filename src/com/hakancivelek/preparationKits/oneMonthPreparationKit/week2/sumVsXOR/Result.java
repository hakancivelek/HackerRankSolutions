package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.sumVsXOR;

/**
 * The Result class contains utility methods for solving mathematical problems.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Calculates the number of values of `x` such that the sum of `n + x` equals the bitwise XOR of `n ^ x`.
     *
     * The number of such values is determined by the number of zero bits in the binary representation of `n`.
     * If `n` is 0, the result is always 1 since `n + 0 = n ^ 0`.
     *
     * @param n The input number for which the calculation is performed.
     * @return The number of valid values of `x`.
     */
    public static long sumXor(long n) {
        if (n == 0) {
            return 1;
        }

        int countZeros = 0;
        long temp = n;

        // Count the number of zero bits in the binary representation of n.
        while (temp > 0) {
            if ((temp & 1) == 0) {
                countZeros++;
            }
            temp >>= 1;
        }

        // The result is 2 raised to the power of countZeros.
        return 1L << countZeros;
    }
}
