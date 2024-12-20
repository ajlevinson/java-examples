package io.ajlevinson.arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HighestNumberFunctionsTest {

    private HighestNumberFunctions highestNumberFunctions;

    @Before
    public void setup() {
        highestNumberFunctions = new HighestNumberFunctions();
    }

    @After
    public void teardown() {
        highestNumberFunctions = null;
    }

    @Test
    public void testGetHighestWithSort() {
        int[] values = {1,5,24,6,18,17};
        int result = highestNumberFunctions.getHighestWithSort(values);
        Assert.assertEquals("Should have the expected highest number.", result, 24);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHighestNumberFunction_WithSort_NullValues() {
        int[] values = null;
        highestNumberFunctions.getHighestWithSort(values);
    }

    @Test
    public void testGetHighestWithSort_emptyArray() {
        int[] values = {};
        int result = highestNumberFunctions.getHighestWithSort(values);
        Assert.assertEquals("Should get a result of 0 due to an empty array.", result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHighestNumberFunction_ManualIteration_NullValues() {
        int[] values = null;
        highestNumberFunctions.getHighestValueManualIteration(values);
    }

    @Test
    public void testGetHighestManualIteration_emptyArray() {
        int[] values = {};
        int result = highestNumberFunctions.getHighestValueManualIteration(values);
        Assert.assertEquals("Should get a result of 0 due to an empty array.", result, 0);
    }

    @Test
    public void testGetHighestManualIteration() {
        int[] values = {1,5,24,6,18,17};
        int result = highestNumberFunctions.getHighestValueManualIteration(values);
        Assert.assertEquals("Should have the expected highest number.", result, 24);
    }

    @Test
    public void testGetHighestWithSort_duplicateValues() {
        int[] values = {1,5,25,6,18,24,19,18,25,17};
        int result = highestNumberFunctions.getHighestValueManualIteration(values);
        Assert.assertEquals("Should have the expected highest number.", result, 25);
    }


}
