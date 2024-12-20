package io.ajlevinson.general;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class GenericFunctionTest {

    private GenericFunction function;

    @After
    public void teardown() {
        function = null;
    }

    @Test
    public void testGenericFunction_Integer() {
        function = new GenericFunction<Integer>();
        Integer[] input = {15,23,60,3};
        int result = function.printArray(input);
        Assert.assertEquals("Should have 4 entries processed.", 4, result);
    }

    @Test
    public void testGenericFunction_String() {
        function = new GenericFunction<String>();
        String[] input = {"15","23","foo","bar","hello"};
        int result = function.printArray(input);
        Assert.assertEquals("Should have 5 entries processed.", 5, result);
    }
}
