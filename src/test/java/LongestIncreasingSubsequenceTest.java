import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestIncreasingSubsequenceTest {


    @Test
    public void test1(){

        LongestIncreasingSubsequence test = new LongestIncreasingSubsequence();

        int[] nums = new int[]{10,9,2,5,3,7,101,18};

        assertEquals(4, LongestIncreasingSubsequence.lengthOfLIS(nums));

    }

    @Test
    public void test2(){

        LongestIncreasingSubsequence test = new LongestIncreasingSubsequence();

        int[] nums = new int[]{0,2,3,10};

        assertEquals(4, LongestIncreasingSubsequence.lengthOfLIS(nums));

    }


    @Test
    public void test3(){

        LongestIncreasingSubsequence test = new LongestIncreasingSubsequence();

        int[] nums = new int[]{7,0,7,3,10};

        assertEquals(3, LongestIncreasingSubsequence.lengthOfLIS(nums));

    }


    @Test
    public void test0(){

        LongestIncreasingSubsequence test = new LongestIncreasingSubsequence();

        int[] nums = new int[]{0,0};

        assertEquals(1, LongestIncreasingSubsequence.lengthOfLIS(nums));

    }

}
