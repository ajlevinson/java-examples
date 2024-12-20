package io.ajlevinson.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramFunctionTest {

    private AnagramFunction anagramFunction;

    @Before
    public void setup() {
        anagramFunction = new AnagramFunction();
    }

    @Test
    public void testIsAnagram_False() {
        String string1 = "movie";
        String string2 = "fooba";

        boolean result = anagramFunction.areAnagrams(string1, string2);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsAnagram() {
        String string1 = "movie";
        String string2 = "voime";

        boolean result = anagramFunction.areAnagrams(string1, string2);
        Assert.assertTrue(result);
    }
}
