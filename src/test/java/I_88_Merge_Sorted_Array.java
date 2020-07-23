import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class I_88_Merge_Sorted_Array {


    @Test
    public void test() {

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int[] output = {1,2,2,3,5,6};
        merge(nums1 ,m, nums2, n);


        assert Arrays.equals(nums1,output);

    }
    @Test
    public void test2() {

        int[] nums1 = {2,3,0};
        int m = 2;
        int[] nums2 = {1};
        int n = 1;

        int[] output = {1,2,3};
        merge(nums1 ,m, nums2, n);
        assert Arrays.equals(nums1,output);

    }


    @Test
    public void test3() {

        int[] nums1 = {-3,3,0,0};
        int m = 2;
        int[] nums2 = {1,5};
        int n = 2;

        int[] output = {-3,1,3,5};
        merge(nums1 ,m, nums2, n);
        assert Arrays.equals(nums1,output);

    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        n--;
        m--;
        for (int i = (nums1.length-1); i >= 0 && n >= 0; i--) {
            if(m >= 0 && nums1[m] > nums2[n]){
                nums1[i] = nums1[m];
                m--;
            }else{
                nums1[i] = nums2[n];
                n--;
            }
        }
    }

}
