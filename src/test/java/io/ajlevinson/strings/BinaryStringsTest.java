package io.ajlevinson.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryStringsTest {

    private BinaryStrings binaryStrings;

    @Before
    public void setup() {
        binaryStrings = new BinaryStrings();
    }

    @Test
    public void testAddStrings() {
        String string1 = "1101";
        String string2 = "111";

        String result = binaryStrings.addBinary(string1, string2);

        Assert.assertEquals("Should have an equal result", "10100", result);
    }
}
