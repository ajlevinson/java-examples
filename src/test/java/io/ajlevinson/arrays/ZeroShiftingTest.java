package io.ajlevinson.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZeroShiftingTest {

    private ZeroShifting zeroShifting;

    @Before
    public void setup() {
        zeroShifting = new ZeroShifting();
    }

    @Test
    public void testZeroShift() {
        int[] input = {0,0,3,5,0,9};
        zeroShifting.pushZerosToEnd(input);
        for(int i = 0; i < 3; i++) {
            Assert.assertNotEquals("Should not have a 0 in the first 3 array integers.", 0, input[i]);
        }
    }
}
