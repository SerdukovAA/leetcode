import solution1.EnvelopeService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Solution1Test {



    @Test
    public void checkSolution(){
        EnvelopeService service = new EnvelopeService();

        int[][] input = new int[4][2];
        input[0] = new int[]{5, 4};
        input[1] = new int[]{6, 4};
        input[2] = new int[]{6, 7};
        input[3] = new int[]{2, 3};

        assertEquals(3, service.maxEnvelopes(input));


    }

    @Test
    public void checkSolution2(){
        EnvelopeService service = new EnvelopeService();
        int[][] input = new int[2][2];
        input[0] = new int[]{6, 4};
        input[1] = new int[]{6, 4};
        assertEquals(1, service.maxEnvelopes(input));
    }


    @Test
    public void checkSolution3(){
        EnvelopeService service = new EnvelopeService();
        int[][] input = new int[2][2];
        input[0] = new int[]{5, 3};
        input[1] = new int[]{6, 4};
        assertEquals(2, service.maxEnvelopes(input));
    }


    @Test
    public void checkSolution4(){
        EnvelopeService service = new EnvelopeService();

        int[][] input = new int[5][2];
        input[0] = new int[]{5, 4};
        input[1] = new int[]{6, 4};
        input[2] = new int[]{8, 8};
        input[3] = new int[]{6, 7};
        input[4] = new int[]{2, 3};

        assertEquals(4, service.maxEnvelopes(input));
    }

}