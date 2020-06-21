import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordPattern_290Test {


    private WordPattern_290 service = new WordPattern_290();

    @Test
    public void test1() {

        assertTrue(service.wordPattern("abba", "dog cat cat dog"));

        assertFalse(service.wordPattern("abba", "dog cat cat fish"));

        assertFalse(service.wordPattern("aaaa", "dog cat cat dog"));

        assertFalse(service.wordPattern("abba", "dog dog dog dog"));

        assertTrue(service.wordPattern("aaaa", "dog dog dog dog"));


    }

}