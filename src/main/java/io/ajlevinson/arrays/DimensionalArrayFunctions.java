package io.ajlevinson.arrays;

public class DimensionalArrayFunctions {

    DimensionalArrayFunctions() {
    }

    public int sumAll(int[][] input) {
        int sum = 0;
        int rows = input.length;
        int cols = input[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum += input[i][j];
            }
        }
        System.out.println("Sum is: " + sum);
        return sum;
    }
}
