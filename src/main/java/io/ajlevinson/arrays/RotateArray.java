package io.ajlevinson.arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RotateArray {

    private static final Logger LOGGER = LogManager.getLogger(RotateArray.class);

    public RotateArray() {
    }

    public void rotateInput(int[] input, int shift) {
        int n = input.length;

        shift %= n;

        reverseInput(input, 0, shift-1);
        reverseInput(input, shift, n-1);
        reverseInput(input, 0, n-1);

        for(int i = 0; i < input.length; i++){
            LOGGER.debug(input[i] + " ");
        }
    }

    public static void reverseInput(int[] input, int start, int end) {
        while(start < end) {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }
}
