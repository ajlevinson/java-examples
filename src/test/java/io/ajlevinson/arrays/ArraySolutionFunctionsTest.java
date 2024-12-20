package io.ajlevinson.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArraySolutionFunctionsTest {

    private ArraySolutionFunctions classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new ArraySolutionFunctions();
    }

    @Test
    public void testSecondaryLargest() {
        int[] input = new int[]{12, 35, 1, 10, 34, 1};
        int result = classUnderTest.getSecondLargest(input);
        Assert.assertEquals(34, result);
    }

    @Test
    public void testSecondaryLargest_DuplicateValues() {
        int[] input = new int[]{10, 10, 5, 10};
        int result = classUnderTest.getSecondLargest(input);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSecondaryLargest_AllDuplicate() {
        int[] input = new int[]{10,10,10,10};
        int result = classUnderTest.getSecondLargest(input);
        Assert.assertEquals(-1, result);
    }
}
