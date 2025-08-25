package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.towerBreakers;

/**
 * Provides the logic for determining the winner of the Tower Breakers game.
 *
 * <p>
 * In the Tower Breakers game:
 * <ul>
 *   <li>Two players take turns to reduce the height of a tower to one of its divisors (other than itself).</li>
 *   <li>The player who cannot make a move loses the game.</li>
 *   <li>Player 1 always plays first, followed by Player 2.</li>
 * </ul>
 * </p>
 *
 * <p>
 * The rules for determining the winner are:
 * <ul>
 *   <li>If the height of all towers is 1, Player 2 wins (no moves available for Player 1).</li>
 *   <li>If the number of towers is even, Player 2 can mirror Player 1's moves and win.</li>
 *   <li>If the number of towers is odd and the height is greater than 1, Player 1 has the advantage and wins.</li>
 * </ul>
 * </p>
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Determines the winner of the Tower Breakers game based on the number of towers and their height.
     *
     * @param n The number of towers in the game (1 ≤ n ≤ 10^3)
     * @param m The height of each tower (1 ≤ m ≤ 10^3)
     * @return 1 if Player 1 wins, 2 if Player 2 wins
     */
    public static int towerBreakers(int n, int m) {
        if (n % 2 == 0 || m == 1) {
            return 2;
        }
        return 1;
    }
}
