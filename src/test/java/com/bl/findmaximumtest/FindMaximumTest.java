package com.bl.findmaximumtest;

import com.bl.findmaximum.FindMaximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaximumTest {
    private FindMaximum findMaximum;

    @Before
    public void intializeObject(){
        findMaximum = new FindMaximum();
    }

    //TC1.1
    @Test
    public void givenThreeIntegers_KeepMaxInputAtFirstPosition_ShouldReturnMaximum() {
        Integer maximum = findMaximum.getMaximum(3, 2, 1);
        Assert.assertSame(3,maximum);
    }

    //TC1.2
    @Test
    public void givenThreeIntegers_KeepMaxInputAtSecondPosition_ShouldReturnMaximum() {
        Integer maximum = findMaximum.getMaximum(1, 3, 2);
        Assert.assertSame(3,maximum);
    }

}
