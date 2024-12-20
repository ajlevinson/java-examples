package io.ajlevinson.arrays;

public class ZeroShifting {

    ZeroShifting() {
    }

    public void pushZerosToEnd(int[] input) {
        int count = 0;

        for(int i = 0; i < input.length; i++) {
            if(input[i] != 0) {
                int temp = input[i];
                input[i] = input[count];
                input[count] = temp;
                count++;
            }
        }
    }
}
