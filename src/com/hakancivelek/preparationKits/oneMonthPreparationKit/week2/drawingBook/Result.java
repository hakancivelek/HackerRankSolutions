package com.hakancivelek.preparationKits.oneMonthPreparationKit.week2.drawingBook;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Calculates the minimum number of pages that must be turned to reach a specific page.
     *
     * @param numberOfPages The total number of pages in the book.
     * @param pageNumber    The target page number.
     * @return The minimum number of pages to turn.
     */
    public static int pageCount(int numberOfPages, int pageNumber) {
        int turnCountFromStart = pageNumber / 2;
        int turnCountFromEnd = (numberOfPages / 2) - (pageNumber / 2);

        return Math.min(turnCountFromStart, turnCountFromEnd);
    }
}