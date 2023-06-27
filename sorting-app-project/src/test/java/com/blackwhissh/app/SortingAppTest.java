package com.blackwhissh.app;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Arrays;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import static org.junit.jupiter.api.Assertions.*;



/**
 * Provided Unit tests for SortingApp.
 */

public class SortingAppTest {

    private static final Logger logger = LogManager.getLogger(SortingAppTest.class.getName());

    SortingApp sortingApp = new SortingApp();
    StringToArray stringToArray = new StringToArray();

    @ParameterizedTest
    @CsvFileSource(resources = "/testSortingAppData.csv")
    @DisplayName("Simple sorting test")
    public void testSortingApp(String arrayStr, String expectedArrayStr){
        logger.info("Simple sorting test");

        double[] expected = stringToArray.stringToArray(expectedArrayStr);
        double[] actual = stringToArray.stringToArray(arrayStr);

        logger.info("Input Array: " + Arrays.toString(actual));
        logger.info("Expected Array: " + Arrays.toString(expected));

        sortingApp.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        logger.info("Actual Array: " + Arrays.toString(expected));
        logger.info("Sorting Test Complete");
    }

    @Test
    @DisplayName("Testing sort with empty array")
    public void testSortingAppWithEmptyArray(){
        logger.info("Testing sort with empty array");

        double[] arr = {};

        logger.info("Checking array's length");

        assertThrows(IllegalArgumentException.class, () -> sortingApp.bubbleSort(arr));

        logger.info("Sorting Test Complete, exception is thrown");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testSortingAppWithSingleElementArrayData.csv")
    @DisplayName("Testing sort where array has single element")
    public void testSortingAppWithSingleElementArray(String arrayStr, String expectedArrayStr){
        logger.info("Testing sort where array has single element");

        double[] expected = stringToArray.stringToArray(expectedArrayStr);
        double[] actual = stringToArray.stringToArray(arrayStr);

        logger.info("Input Array: " + Arrays.toString(actual));
        logger.info("Expected Array: " + Arrays.toString(expected));

        sortingApp.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        logger.info("Actual Array: " + Arrays.toString(expected));
        logger.info("Sorting Test Complete");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testSortingAppArrayWithNegativeValuesData.csv")
    @DisplayName("Testing sort where array has negative values")
    public void testSortingAppArrayWithNegativeValues(String arrayStr, String expectedArrayStr){
        logger.info("Testing sort where array has negative values");

        double[] expected = stringToArray.stringToArray(expectedArrayStr);
        double[] actual = stringToArray.stringToArray(arrayStr);

        logger.info("Input Array: " + Arrays.toString(actual));
        logger.info("Expected Array: " + Arrays.toString(expected));

        sortingApp.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        logger.info("Actual Array: " + Arrays.toString(expected));
        logger.info("Sorting Test Complete");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testSortingAppWithAlreadySortedArrayData.csv")
    @DisplayName("Testing sort where array is already sorted")
    public void testSortingAppWithAlreadySortedArray(String arrayStr, String expectedArrayStr){
        logger.info("Testing sort where array is already sorted");

        double[] expected = stringToArray.stringToArray(expectedArrayStr);
        double[] actual = stringToArray.stringToArray(arrayStr);
        logger.info("Input Array: " + Arrays.toString(actual));
        logger.info("Expected Array: " + Arrays.toString(expected));

        sortingApp.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        logger.info("Actual Array: " + Arrays.toString(expected));
        logger.info("Sorting Test Complete");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testSortingAppWithDescendingOrderArrayData.csv")
    @DisplayName("Testing sort where array is in descending order")
    public void testSortingAppWithDescendingOrderArray(String arrayStr, String expectedArrayStr){
        logger.info("Testing sort where array is in descending order");

        double[] expected = stringToArray.stringToArray(expectedArrayStr);
        double[] actual = stringToArray.stringToArray(arrayStr);

        logger.info("Input Array: " + Arrays.toString(actual));
        logger.info("Expected Array: " + Arrays.toString(expected));

        sortingApp.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        logger.info("Actual Array: " + Arrays.toString(expected));
        logger.info("Sorting Test Complete");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testSortingAppWithDuplicateElements.csv")
    @DisplayName("Testing sort where array has duplicate elements")
    public void testSortingAppWithDuplicateElements(String arrayStr, String expectedArrayStr){
        logger.info("Testing sort where array has duplicate elements");

        double[] expected = stringToArray.stringToArray(expectedArrayStr);
        double[] actual = stringToArray.stringToArray(arrayStr);

        logger.info("Input Array: " + Arrays.toString(actual));
        logger.info("Expected Array: " + Arrays.toString(expected));

        sortingApp.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        logger.info("Actual Array: " + Arrays.toString(expected));
        logger.info("Sorting Test Complete");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testSortingAppWithAllSameValues.csv")
    @DisplayName("Testing sort where array's values are all same")
    public void testSortingAppWithAllSameValues(String arrayStr, String expectedArrayStr){
        logger.info("Testing sort where array's values are all same");

        double[] expected = stringToArray.stringToArray(expectedArrayStr);
        double[] actual = stringToArray.stringToArray(arrayStr);

        logger.info("Input Array: " + Arrays.toString(actual));
        logger.info("Expected Array: " + Arrays.toString(expected));

        sortingApp.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        logger.info("Actual Array: " + Arrays.toString(expected));
        logger.info("Sorting Test Complete");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testSortingAppWithHalfSortedArray.csv")
    @DisplayName("Testing sort where array is partially sorted")
    public void testSortingAppWithHalfSortedArray(String arrayStr, String expectedArrayStr){
        logger.info("Testing sort where array is partially sorted");

        double[] expected = stringToArray.stringToArray(expectedArrayStr);
        double[] actual = stringToArray.stringToArray(arrayStr);

        logger.info("Input Array: " + Arrays.toString(actual));
        logger.info("Expected Array: " + Arrays.toString(expected));

        sortingApp.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        logger.info("Actual Array: " + Arrays.toString(expected));
        logger.info("Sorting Test Complete");
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/testSortingAppWithDoubleValues.csv")
    @DisplayName("Testing sort where array has double values")
    public void testSortingAppWithDoubleValues(String arrayStr, String expectedArrayStr){
        logger.info("Testing sort where array has double values");

        double[] expected = stringToArray.stringToArray(expectedArrayStr);
        double[] actual = stringToArray.stringToArray(arrayStr);

        logger.info("Input Array: " + Arrays.toString(actual));
        logger.info("Expected Array: " + Arrays.toString(expected));


        sortingApp.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        logger.info("Actual Array: " + Arrays.toString(expected));
        logger.info("Sorting Test Complete");
    }
}
