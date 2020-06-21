import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        char[] c = pattern.toCharArray();
        String[] w = str.split(" ");
        if(c.length != w.length){
            return false;
        }
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i]) || map.values().contains(w[i])) {
               if(!w[i].equals(map.get(c[i]))) return false;
            } else {
                map.put(c[i], w[i]);
            }
        }
        return true;

    }
}
