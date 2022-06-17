package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class GetSecondToLastElementTest {


    @Test
    public void testGetSecondToLastElement1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "lazy";
        String actual = StringArrayUtils.getSecondToLastElement(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSecondToLastElement2() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "lazy"};
        String expected = "over";
        String actual = StringArrayUtils.getSecondToLastElement(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetSecondToLastElement3() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over"};
        String expected = "jumps";
        String actual = StringArrayUtils.getSecondToLastElement(array);
        Assert.assertEquals(expected, actual);
    }

}
