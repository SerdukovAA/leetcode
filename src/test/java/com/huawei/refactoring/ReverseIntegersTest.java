package com.huawei.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegersTest {


    @Test
    public void test2() {
        ReverseIntegers reverseIntegers = new ReverseIntegers();
        int[] nums = new int[]{0,1,1,2,3,3};
        int len = reverseIntegers.removeDuplicates(nums);
        assertEquals( 4, len);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    @Test
    public void test3() {
        ReverseIntegers reverseIntegers = new ReverseIntegers();
        int[] nums = new int[]{0,0,0,0,0,0};
        int len = reverseIntegers.removeDuplicates(nums);
        assertEquals( 1, len);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }


    @Test
    public void test4() {
        ReverseIntegers reverseIntegers = new ReverseIntegers();
        int[] nums = new int[]{1,1,2};
        int len = reverseIntegers.removeDuplicates(nums);
        assertEquals( 2, len);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }


    @Test
    public void test9() {
        ReverseIntegers reverseIntegers = new ReverseIntegers();
        int[] nums = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,5,6,7,8};
        int len = reverseIntegers.removeDuplicates(nums);
        assertEquals( 8, len);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }


    @Test
    public void test99() {
        ReverseIntegers reverseIntegers = new ReverseIntegers();
        int[] nums = new int[]{-4,-3,-2,-1,0,1,1,1,1,1,1,1,2,3,4,5,5,6,7,8};
        int len = reverseIntegers.removeDuplicates(nums);
        assertEquals( 13, len);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }


}
