package com.blackwhissh.app;

import java.util.Arrays;

/**
 * Using this class/method we can convert string(given in CSV file in Array format) to string.
 */
public class StringToArray {
    public double[] stringToArray(String arrayStr){

        String[] split = arrayStr.replace("[", "").replace("]", "")
                .split(";");
        return Arrays.stream(split)
                .mapToDouble(c -> Double.parseDouble(c.trim()))
                .toArray();
    }
}
