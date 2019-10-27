import java.util.ArrayDeque;
import java.util.Deque;

public class SplitStringBalancedStrings {



    public int balancedStringSplit(String s) {
        int r= 0;
        char[] chars = s.toCharArray();
        Deque<Character> stack = new ArrayDeque(chars.length);
        for (char aChar : chars) {

            if(!stack.isEmpty() && !stack.peek().equals(aChar)){
                stack.pop();
            }else{
                stack.push(aChar);
            }
            if(stack.isEmpty()){
                r++;
            }
        }
        return r;
    }




}
