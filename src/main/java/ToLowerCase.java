

public class ToLowerCase {

    static int LETTERS_GAP = 'a' - 'A';


    public String toLowerCase(String str) {
        StringBuilder builder = new StringBuilder();
        char[] chars = str.toCharArray();
        char c;
        for (int i = 0; i < chars.length; i++) {
            c = chars[i];
            if ( c<='Z' && c >= 'A')
                builder.append(Character.toChars(c + LETTERS_GAP));
            else
                builder.append(c);
        }
        return builder.toString();
    }

}
