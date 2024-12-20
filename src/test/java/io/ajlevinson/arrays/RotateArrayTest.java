package io.ajlevinson.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotateArrayTest {

    private RotateArray rotateArray;

    @Before
    public void setup() {
        rotateArray = new RotateArray();
    }

    @Test
    public void testRotateArray_Normal() {
        int[] arrayToRotate = {14,3,12};
        int shift = 1;
        rotateArray.rotateInput(arrayToRotate, shift);
        Assert.assertEquals(3, arrayToRotate[0]);
        Assert.assertEquals(14, arrayToRotate[2]);
    }
}
