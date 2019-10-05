import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionServiceTest{

    @Test
    public void test00(){
        SolutionService service = new SolutionService();
        int[][] envelops = new int[0][2];
        assertEquals(0, service.maxEnvelopes(envelops));
    }



    @Test
    public void test(){
        SolutionService service = new SolutionService();
        int[][] envelops = new int[4][2];
        envelops[0] = new int[]{5,4};
        envelops[1] = new int[]{6,4};
        envelops[2] = new int[]{6,7};
        envelops[3] = new int[]{2,3};
        assertEquals(3, service.maxEnvelopes(envelops));
    }

    @Test
    public void test33(){
        SolutionService service = new SolutionService();
        int[][] envelops = new int[5][2];
        envelops[0] = new int[]{2,7};
        envelops[1] = new int[]{2,8};
        envelops[2] = new int[]{8,18};
        envelops[3] = new int[]{4,6};
        envelops[4] = new int[]{5,13};
        assertEquals(3, service.maxEnvelopes(envelops));
    }

    @Test
    public void test2(){

        SolutionService service = new SolutionService();

        int[][] envelops = new int[2][2];
        envelops[0] = new int[]{6,4};
        envelops[1] = new int[]{6,4};
        assertEquals(1, service.maxEnvelopes(envelops));

    }

    @Test
    public void test10(){

        SolutionService service = new SolutionService();
        int[][] envelops = new int[4][2];
        envelops[0] = new int[]{30,50};
        envelops[1] = new int[]{12,2};
        envelops[2] = new int[]{3,4};
        envelops[3] = new int[]{12,15};
        assertEquals(3, service.maxEnvelopes(envelops));

    }




    @Test
    public void test101(){

        SolutionService service = new SolutionService();
        int[][] envelops = new int[5][2];
        envelops[0] = new int[]{46,89};
        envelops[1] = new int[]{50,53};
        envelops[2] = new int[]{52,68};
        envelops[3] = new int[]{72,45};
        envelops[4] = new int[]{77,81};
        assertEquals(3, service.maxEnvelopes(envelops));

    }


    @Test
    public void test1(){

        SolutionService service = new SolutionService();

        int[][] envelops = new int[2][2];
        envelops[0] = new int[]{6,4};
        envelops[1] = new int[]{2,3};
        assertEquals(2, service.maxEnvelopes(envelops));

    }

    @Test
    public void test0(){

        SolutionService service = new SolutionService();

        int[][] envelops = new int[1][2];
        envelops[0] = new int[]{1,1};
        assertEquals(1, service.maxEnvelopes(envelops));

    }



}
