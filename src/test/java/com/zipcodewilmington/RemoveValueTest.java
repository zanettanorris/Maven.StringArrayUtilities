package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class RemoveValueTest {

    @Test
    public void testRemoveValue() {
        String[] array = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(array, "The");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemoveValue1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(array, "quick");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemoveValue2() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "quick", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(array, "brown");
        Assert.assertEquals(actual, expected);
    }

}
