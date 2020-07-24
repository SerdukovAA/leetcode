import org.junit.Test;

import java.util.*;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

public class I_1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {

    @Test
    public void test() {
        int[] nums = {8,1,2,2,3};
        int[] output = {4,0,1,1,3};
        assert Arrays.equals(smallerNumbersThanCurrent(nums), output);
    }

    @Test
    public void test2() {
        int[] nums = {6,5,4,8};
        int[] output = {2,1,0,3};
        assert Arrays.equals(smallerNumbersThanCurrent(nums), output);
    }

    @Test
    public void test3() {
        int[] nums = {7,7,7,7};
        int[] output = {0,0,0,0};
        assert Arrays.equals(smallerNumbersThanCurrent(nums), output);
    }

    @Test
    public void test4() {
        int[] nums = {1};
        int[] output = {0};
        assert Arrays.equals(smallerNumbersThanCurrent(nums), output);
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.length ; i++) {
            map.putIfAbsent(sorted[i], i);
        }
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }

}
