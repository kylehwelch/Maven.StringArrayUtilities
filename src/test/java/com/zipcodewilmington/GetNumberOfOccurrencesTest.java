package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class GetNumberOfOccurrencesTest {


    @Test
    public void testGetNumberOfOccurrences1() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        int expected = 4;
        int actual = StringArrayUtils.getNumberOfOccurrences(array, "bba");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetNumberOfOccurrences2() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        int expected = 2;
        int actual = StringArrayUtils.getNumberOfOccurrences(array, "bbb");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetNumberOfOccurrences3() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        int expected = 4;
        int actual = StringArrayUtils.getNumberOfOccurrences(array, "bba");
        Assert.assertEquals(actual, expected);
    }

}
