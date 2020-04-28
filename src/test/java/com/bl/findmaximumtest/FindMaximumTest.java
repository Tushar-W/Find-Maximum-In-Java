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

    //TC1.3
    @Test
    public void givenThreeIntegers_KeepMaxInputAtThirdPosition_ShouldReturnMaximum() {
        Integer maximum = findMaximum.getMaximum(1, 2, 3);
        Assert.assertSame(3,maximum);
    }

    //TC2.1
    @Test
    public void givenThreeFloats_KeepMaxInputAtFirstPosition_ShouldReturnMaximum() {
        Float maximum = findMaximum.getMaximum(1.3f, 1.2f, 1.1f);
        Assert.assertEquals(1.3,maximum,0.1);
    }

    //TC2.2
    @Test
    public void givenThreeFloats_KeepMaxInputAtSecondPosition_ShouldReturnMaximum() {
        Float maximum = findMaximum.getMaximum(1.1f, 1.3f, 1.2f);
        Assert.assertEquals(1.3,maximum,0.1);
    }

    //TC2.3
    @Test
    public void givenThreeFloats_KeepMaxInputAtThirdPosition_ShouldReturnMaximum() {
        Float maximum = findMaximum.getMaximum(1.1f, 1.2f, 1.3f);
        Assert.assertEquals(1.3,maximum,0.1);
    }

    //TC3.1
    @Test
    public void givenThreeString_KeepMaxInputAtFirstPosition_ShouldReturnMaximum() {
        String maximum = findMaximum.getMaximum("Peach","Apple","Banana");
        Assert.assertSame("Peach",maximum);
    }

    //TC3.2
    @Test
    public void givenThreeString_KeepMaxStringAtSecondPosition_ShouldReturnMaximum() {
        String maximum = findMaximum.getMaximum("Apple","Peach","Banana");
        Assert.assertSame("Peach",maximum);
    }

    //TC3.3
    @Test
    public void givenThreeString_KeepMaxStringAtThirdPosition_ShouldReturnMaximum() {
        String maximum = findMaximum.getMaximum("Apple","Banana","Peach");
        Assert.assertSame("Peach",maximum);
    }

}
