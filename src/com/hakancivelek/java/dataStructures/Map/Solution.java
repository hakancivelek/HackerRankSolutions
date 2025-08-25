package com.hakancivelek.java.dataStructures.Map;

import java.util.*;

/**
 * This class provides a solution to the problem of managing a phone book and processing queries.
 * The program takes phone book entries and allows users to query for phone numbers by names.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Solution {

    /**
     * The main method reads input, processes phone book entries, and handles queries.
     *
     * <p>The input format includes an integer `n` (the number of entries in the phone book),
     * followed by `n` name-phone pairs. After these, there are query names to find in the phone book.
     * If the name exists, the corresponding phone number is printed; otherwise, "Not found" is printed.</p>
     *
     * @param argh command-line arguments (not used)
     */
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }

        while (in.hasNextLine()) {
            String query = in.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
