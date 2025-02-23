package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.counterGame;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Determines the winner of the Counter Game.
     *
     * @param n the initial number in the game.
     * @return the name of the winner: "Richard" or "Louise".
     */
    public static String counterGame(long n) {
        boolean isLouiseTurn = true;
        boolean isPowerOfTwo;

        while (n > 1) {
            isPowerOfTwo = isPowerOfTwo(n);
            if (isPowerOfTwo) {
                n /= 2;
            } else {
                long largestPowerOfTwo = Long.highestOneBit(n);
                n -= largestPowerOfTwo;
            }

            // Switch turns
            isLouiseTurn = !isLouiseTurn;
        }

        return isLouiseTurn ? "Richard" : "Louise";
    }

    /**
     * Checks if the given number is a power of two.
     *
     * @param n the number to check.
     * @return true if the number is a power of two, false otherwise.
     */
    public static boolean isPowerOfTwo(long n) {

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }

        return true;
    }

}
