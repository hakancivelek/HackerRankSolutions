package com.hakancivelek.preparationKits.oneMonthPreparationKit.week1.flippingBits;

/**
 * The Result class provides a method to flip all bits of a given 32-bit unsigned integer.
 * @author Hakan Civelek
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Result {

    /**
     * Flips all 32 bits of the given number and returns the unsigned integer result.
     *
     * <p>Since Java does not support unsigned integers, we use a bitwise XOR operation
     * with 0xFFFFFFFFL to invert the bits.</p>
     *
     * @param n The input integer (32-bit unsigned).
     * @return The result after flipping all bits, interpreted as an unsigned integer.
     */
    public static long flippingBits(long n) {
        return n ^ 0xFFFFFFFFL;
    }
}
