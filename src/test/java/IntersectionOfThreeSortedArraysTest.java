import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class IntersectionOfThreeSortedArraysTest {



    @Test
    public void test2(){


        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,5,7,9};
        int[] arr3 = new int[]{1,3,4,5,8};


        assertEquals(Arrays.asList(1,5), IntersectionOfThreeSortedArrays.arraysIntersection(arr1, arr2, arr3));

    }

}
