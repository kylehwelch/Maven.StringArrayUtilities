package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class GetSecondElementTest {


    @Test
    public void testGetSecondElement1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "quick";
        String actual = StringArrayUtils.getSecondElement(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSecondElement2() {
        String[] array = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "brown";
        String actual = StringArrayUtils.getSecondElement(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetSecondElement3() {
        String[] array = {"brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "fox";
        String actual = StringArrayUtils.getSecondElement(array);
        Assert.assertEquals(expected, actual);
    }
}
