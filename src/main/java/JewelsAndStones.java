import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        char[] jewels = J.toCharArray();
        Map<Character, Integer> countersMap = new HashMap<>();
        for (char jewel : jewels) {
            countersMap.put(jewel, 0);
        }
        char[] stones = S.toCharArray();
        for (char stone : stones) {
            countersMap.computeIfPresent(stone, (c, counter) -> ++counter);
        }
        return countersMap.values().stream().mapToInt(i->i).sum();
    }





}
