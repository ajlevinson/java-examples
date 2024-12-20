package io.ajlevinson.strings;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringFunctionTest {

    private ReverseStringFunction function;

    @Before
    public void setup() {
        function = new ReverseStringFunction();
    }

    @After
    public void tearDown() {
        function = null;
    }

    @Test
    public void testReverseString() {
        String input = "Breakfast Menu";
        String expected = "uneM tsafkaerB";

        String result = function.reverseString(input);
        Assert.assertEquals("Message should match expected.", result, expected);
    }
}
