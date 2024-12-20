package io.ajlevinson.arrays;

public class ReverseArray {

    public ReverseArray() {
    }

    public String doReverse(int[] input) {
        int left = 0, right = input.length - 1;
        String result = "";

        while(left < right) {
            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;

            left++;
            right--;
        }
        for(int i = 0; i < input.length; i++) {
            result = result + (input[i] + " ");
        }
        System.out.println("Result is: " + result.trim());
        return result.trim();
    }
}
