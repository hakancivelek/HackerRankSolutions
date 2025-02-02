package com.hakancivelek.week1.timeConversion;

import java.io.*;

/**
 * @author <a href="mailto:hakancivelek5461@gmail.com">Hakan CİVELEK</a>
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }
}

