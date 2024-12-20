package io.ajlevinson.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotationFunctionTest {

    private RotationFunction rotationFunction;

    @Before
    public void setup() {
        rotationFunction = new RotationFunction();
    }

    @Test
    public void testIsRotation_True() {
        String string1 = "aab";
        String string2 = "aba";

        boolean result = rotationFunction.areRotations(string1, string2);

        Assert.assertTrue("Should be true for a rotation.", result);
    }

    @Test
    public void testIsRotation_False() {
        String string1 = "oscar";
        String string2 = "grouch";

        boolean result = rotationFunction.areRotations(string1, string2);

        Assert.assertFalse("Should not be true for a rotation.", result);
    }

    @Test
    public void testIsRotation_FalseButClose() {
        String string1 = "bookie";
        String string2 = "koob";

        boolean result = rotationFunction.areRotations(string1, string2);

        Assert.assertFalse("Should not be true for a rotation.", result);
    }

    @Test
    public void testIsRotation_TrueKMP() {
        String string1 = "aab";
        String string2 = "aba";

        boolean result = rotationFunction.areRotationsKMP(string1, string2);

        Assert.assertTrue("Should be true for a rotation.", result);
    }
}
