package io.ajlevinson.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseArrayTest {

    private ReverseArray reverseArray;

    @Before
    public void setup() {
        reverseArray = new ReverseArray();
    }

    @Test
    public void testReverseArray_Normal() {
        int[] input = { 12, 15, 2, 25, 30};

        String result = reverseArray.doReverse(input);
        String expected = "30 25 2 15 12";
        Assert.assertEquals("Strings should match", expected, result);
    }

    @Test
    public void testReverseArray_Duplicate() {
        int[] input = { 12, 12, 12, 12, 12};

        String result = reverseArray.doReverse(input);
        String expected = "12 12 12 12 12";
        Assert.assertEquals("Strings should match", expected, result);
    }
}
