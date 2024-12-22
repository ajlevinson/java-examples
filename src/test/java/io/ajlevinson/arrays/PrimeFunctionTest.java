package io.ajlevinson.arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFunctionTest {

    private PrimeFunction primeFunction;

    @Before
    public void setup() {
        primeFunction = new PrimeFunction();
    }

    @After
    public void teardown() {
        primeFunction = null;
    }

    @Test
    public void testIsPrime_emptyArray() {
        int[] input = {};
        List<Boolean> results = primeFunction.isPrime(input);
        List<Boolean> expected = new ArrayList<>();
        Assert.assertEquals("Should have an empty list.", expected, results);
    }

    @Test
    public void testIsPrime_allPrime() {
        int input[] = {3,7,11};
        List<Boolean> results = primeFunction.isPrime(input);
        List<Boolean> expected = Arrays.asList(true, true, true);
        Assert.assertEquals("Should have 3 true results.", expected, results);
    }

    @Test
    public void testIsPrime_allNonPrime() {
        int input[] = {4,12,20};
        List<Boolean> results = primeFunction.isPrime(input);
        List<Boolean> expected = Arrays.asList(false, false, false);
        Assert.assertEquals("Should have 3 false results.", expected, results);
    }

    @Test
    public void testIsPrime_oneOrZero() {
        int input[] = {1,0};
        List<Boolean> results = primeFunction.isPrime(input);
        List<Boolean> expected = Arrays.asList(false, false);
        Assert.assertEquals("Should have 2 false results.", expected, results);
    }

    @Test
    public void testIsPrime_mixedPrime() {
        int input[] = {7,10,11,20};
        List<Boolean> results = primeFunction.isPrime(input);
        List<Boolean> expected = Arrays.asList(true, false, true, false);
        Assert.assertEquals("Should have 4 results, 50/50 split on prime or not prime.", expected, results);
    }

}
