package io.ajlevinson.arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class HighestNumberFunctions {

    private static final Logger LOGGER = LogManager.getLogger(HighestNumberFunctions.class);

    HighestNumberFunctions() {
    }

    public int getHighestWithSort(int[] values) throws IllegalArgumentException {
        if(values == null) {
            throw new IllegalArgumentException("Unable to process a null array of integers.");
        }
        int length = values.length;
        int highestInt = 0;
        if(length == 0) {
            LOGGER.debug("The integer array of values is empty, returning 0.");
            return highestInt;
        }

        LOGGER.debug("Obtaining the highest number for the values array with length: " + length);
        Arrays.sort(values);
        highestInt = values[length - 1];
        LOGGER.debug("The return value is: " + highestInt);
        return highestInt;
    }

    public int getHighestValueManualIteration(int[] values) throws IllegalArgumentException {
        if(values == null) {
            throw new IllegalArgumentException("Unable to process a null array of integers.");
        }
        int length = values.length;
        int highestInt = 0;
        if(length == 0) {
            LOGGER.debug("The integer array of values is empty, returning 0.");
            return highestInt;
        }
        LOGGER.debug("Obtaining the highest number for the values array with length: " + length);
        for(int i = 0; i < length; i++) {
            if(values[i] > highestInt) {
                highestInt = values[i];
            }
        }
        LOGGER.debug("The return value is: " + highestInt);
        return highestInt;
    }

}
