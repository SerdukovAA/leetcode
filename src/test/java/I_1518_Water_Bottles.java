import org.junit.Test;

public class I_1518_Water_Bottles {


    @Test
    public void test() {
      assert numWaterBottles(9, 3) == 13;
      assert numWaterBottles(5, 5) == 6;
      assert numWaterBottles(2, 3) == 2;
      assert numWaterBottles(15, 4) == 19;
      assert numWaterBottles(15, 8) == 17;
    }

///////////////
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        int remains = 0;
        int  withRemians;
        while(numBottles > 0){
            withRemians = (numBottles+remains);
            numBottles = withRemians / numExchange;
            remains = withRemians % numExchange;
            result += numBottles;
        }
        return result;

    }
//////////
    public int otherSolution(int numBottles, int numExchange) {
        return numWaterBottles2(numBottles, numExchange, 0);
    }

    public int numWaterBottles2(int numBottles, int numExchange, int remains) {
        int  withRemians = (numBottles+remains);
        if(withRemians == 0){
            return 0;
        }
        if(withRemians == 1){
            return 1;
        }
        return numBottles + numWaterBottles2(  withRemians/numExchange   , numExchange, withRemians%numExchange);
    }

}
