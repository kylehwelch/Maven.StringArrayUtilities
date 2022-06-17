package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class RemovePackDuplicatesTest {


    @Test
    public void testRemovePackDuplicates1() {
        String[] array = {"a", "a", "a", "b", "c", "c", "a", "a", "d"};
        String[] expected = {"aaa", "b", "cc", "aa", "d"};
        String[] actual = StringArrayUtils.packConsecutiveDuplicates(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemovePackDuplicates2() {
        String[] array = {"t", "t", "q", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e"};
        String[] expected = {"tt", "q", "aaa", "b", "cc", "aa", "d", "eee"};
        String[] actual = StringArrayUtils.packConsecutiveDuplicates(array);
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testRemovePackDuplicates3() {
        String[] array = {"m", "o", "o", "n", "m", "a", "n"};
        String[] expected = {"m", "oo", "n", "m", "a", "n"};
        String[] actual = StringArrayUtils.packConsecutiveDuplicates(array);
        Assert.assertEquals(expected, actual);
    }


}
