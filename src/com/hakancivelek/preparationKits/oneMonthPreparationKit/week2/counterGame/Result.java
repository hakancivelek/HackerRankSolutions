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

        while (n > 1) {
            boolean isPowerOfTwo = n == Long.highestOneBit(n);
            if (isPowerOfTwo) {
                n /= 2;
            } else {
                long largestPowerOfTwo = Long.highestOneBit(n);
                n -= largestPowerOfTwo;
            }

            isLouiseTurn = !isLouiseTurn;
        }

        return isLouiseTurn ? "Richard" : "Louise";
    }

}
