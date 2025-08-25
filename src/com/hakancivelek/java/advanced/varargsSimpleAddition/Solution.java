package com.hakancivelek.java.advanced.varargsSimpleAddition;

import java.util.*;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        int n6 = scanner.nextInt();
        scanner.close();

        Add ob = new Add();
        ob.add(n1, n2);
        ob.add(n1, n2, n3);
        ob.add(n1, n2, n3, n4, n5);
        ob.add(n1, n2, n3, n4, n5, n6);
    }
}

class Add {
    public void add(int... args) {
        int sum = args[0];
        StringBuilder strResult = new StringBuilder(Integer.toString(args[0]));

        for (int i = 1; i < args.length; i++) {
            sum += args[i];
            strResult.append("+" + args[i]);
        }
        System.out.println(strResult + "=" + sum);
    }
}

