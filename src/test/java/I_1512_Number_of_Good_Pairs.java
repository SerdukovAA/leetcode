import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-good-pairs/

public class I_1512_Number_of_Good_Pairs {


    @Test
    public void test() {
        int[] nums = {1,2,3,1,1,3};
        assert numIdenticalPairs(nums) == 4;
    }
    @Test
    public void test1() {
        int[] nums = {1,1,1,1};
        assert numIdenticalPairs(nums) == 6;
    }

    @Test
    public void test2() {
        int[] nums = {1,2,3,4};
        assert numIdenticalPairs(nums) == 0;
    }

    @Test
    public void test3() {
        int[] nums = {1,1,3,4};
        assert numIdenticalPairs(nums) == 1;
    }

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int c : nums){
            if (map.containsKey(c)) {
                result += map.get(c);
            }
            map.merge(c, 1,  (o ,n ) -> o + n);
        }
        return result;
    }

}
