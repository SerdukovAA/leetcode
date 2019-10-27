import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SplitStringBalancedStringsTest {




    @Test
    public void test1(){
        SplitStringBalancedStrings s = new SplitStringBalancedStrings();
        assertEquals(1, s.balancedStringSplit("RL"));
    }

    @Test
    public void test2(){
        SplitStringBalancedStrings s = new SplitStringBalancedStrings();
        assertEquals(3, s.balancedStringSplit("RLLLLRRRLR"));
    }

    @Test
    public void test3(){
        SplitStringBalancedStrings s = new SplitStringBalancedStrings();
        assertEquals(1, s.balancedStringSplit("LLLLRRRR"));
    }


}
