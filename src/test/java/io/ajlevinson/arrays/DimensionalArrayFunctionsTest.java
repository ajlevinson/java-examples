package io.ajlevinson.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DimensionalArrayFunctionsTest {

    private DimensionalArrayFunctions dimensionalArrayFunctions;

    @Before
    public void setup() {
        dimensionalArrayFunctions = new DimensionalArrayFunctions();
    }

    @Test
    public void testSumAll2Dimensions() {
        int[][] input = {{1,2,7},{3,12,15}};
        int result = dimensionalArrayFunctions.sumAll(input);
        Assert.assertEquals("Result should be 40", 40, result);
    }
}
