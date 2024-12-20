package io.ajlevinson.arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArraySolutionFunctions {

    private static final Logger LOGGER = LogManager.getLogger(ArraySolutionFunctions.class);

    public ArraySolutionFunctions() {
    }

    public int getSecondLargest(int[] input) {

        int n = input.length;

        Arrays.sort(input);

        for (int i = n - 2; i >= 0; i--) {

            if (input[i] != input[n - 1]) {
                LOGGER.debug("Returning the second largest int: " + input[i]);
                return input[i];
            }
        }
        LOGGER.debug("There isn't an int that is the second largest in the array.");
        return -1;
    }
}
