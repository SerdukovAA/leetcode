import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeMath.max;

public class I_11431_Kids_With_the_Greatest_Number_of_Candies {


    @Test
    public void test() {

        int[] candies = {2, 3, 5, 1, 3};
        Boolean[] res = {true, true, true, false, true};
        assert kidsWithCandies(candies, 3).equals(Arrays.asList(res));

        int[] candies2 = {4,2,1,1,2};
        Boolean[] res2 = {true,false,false,false,false};
        assert kidsWithCandies(candies2, 1).equals(Arrays.asList(res2));

        int[] candies3 = {12,1,12};
        Boolean[] res3 = {true,false,true};
        assert kidsWithCandies(candies3, 10).equals(Arrays.asList(res3));

        int[] candies1 = {1, 1};
        Boolean[] res1 = {true, true};
        assert kidsWithCandies(candies1, 1).equals(Arrays.asList(res1));

    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            result.add((candies[i] + extraCandies) >= maxCandies);
        }
        return result;
    }

}
