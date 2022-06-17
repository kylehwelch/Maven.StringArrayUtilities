package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class IsPangramicTest {

    @Test
    public void testIsPangramic1() {
        String[] array = {"The quick brown", "Fox jumps over", "The lazy dog"};
        boolean outcome = StringArrayUtils.isPangramic(array);
        Assert.assertTrue(outcome);
    }

    @Test
    public void testIsPangramic2() {
        String[] array = {"The", "quick", "onyx", "goblin", "jumps", "over", "the", "lazy", "dwarf"};
        boolean outcome = StringArrayUtils.isPangramic(array);
        Assert.assertTrue(outcome);
    }

    @Test
    public void testIsPangramic3() {
        String[] array = {"Five quacking", "zephyrs", "jolt my", "wax bed"};
        boolean outcome = StringArrayUtils.isPangramic(array);
        Assert.assertTrue(outcome);
    }


    @Test
    public void testIsPangramic4() {
        String[] array = {"a", "b", "c", "d"};
        boolean outcome = StringArrayUtils.isPangramic(array);
        Assert.assertFalse(outcome);
    }



}
