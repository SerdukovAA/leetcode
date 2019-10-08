package com.huawei.refactoring;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {


    @Test
    public void test1() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        String J = "aA"; //type of stones that ara jewels
        String S = "aAAbbbb"; //stone
        int res = jewelsAndStones.numJewelsInStones(J, S);
        Assert.assertEquals(3, res);
    }


    @Test
    public void test2() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        String J = "z"; //type of stones that ara jewels
        String S = "ZZzA"; //stone
        int res = jewelsAndStones.numJewelsInStones(J, S);
        Assert.assertEquals(1, res);
    }


    @Test
    public void test3() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        String J = "z"; //type of stones that ara jewels
        String S = "ZZ"; //stone
        int res = jewelsAndStones.numJewelsInStones(J, S);
        Assert.assertEquals(0, res);
    }


}
