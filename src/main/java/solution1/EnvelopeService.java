package solution1;

import java.util.Arrays;
import java.util.Comparator;

public class EnvelopeService {


    public int maxEnvelopes(int[][] envelopes) {

        if(envelopes == null || envelopes.length == 0 ){
            return 0;
        }
        Arrays.sort(envelopes, Comparator.comparingInt(e -> e[0]));

        int max = 1;
        int[] arr = new int[envelopes.length];
        for (int i = 0; i < envelopes.length ; i++) {
            arr[i] = 1;
            for (int j = i-1; j >= 0; j--) {
                if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
                    arr[i] = Math.max(arr[i], arr[j]+1);
                }
            }
            max = Math.max(arr[i], max);
        }

        return max;


    }

}
