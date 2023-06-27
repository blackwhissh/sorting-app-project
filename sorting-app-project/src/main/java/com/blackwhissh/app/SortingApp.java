package com.blackwhissh.app;

import org.apache.commons.lang3.math.NumberUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * This is a simple sorting app which is using Bubble Sort to sort command-line arguments in the
 * ascending order and prints out.
 *
 */
public class SortingApp {
    private static final Logger logger = Logger.getLogger("MainLog");
    private static final FileHandler fh;

    static {
        try {
            fh = new FileHandler("C:/Users/blackwhissh/Desktop/epam/sorting-app-project/mainLog.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {



        SortingApp sortingApp = new SortingApp();
        double[] numbers = new double[args.length];

        // Parsing command-line arguments as integers
        for (int i = 0; i < args.length; i++) {
            NumberUtils.isParsable(args[i]);

            numbers[i] = Double.parseDouble(args[i]);
        }



        toString(numbers);

        sortingApp.bubbleSort(numbers);

        logger.info("Sorted Array: ");
        toString(numbers);
        logger.info("Sorting was successful");
    }

    public void bubbleSort(double[] arr) {
        int n = arr.length;

        if(n == 0){
            logger.warning("Array's length should not be null");
            throw new IllegalArgumentException("Array's length should not be null");
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void toString(double[] arr){
        String arrayStr = Arrays.toString(arr);
        logger.info(arrayStr);
    }
}
