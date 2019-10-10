import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToLowerCaseTest {

    private ToLowerCase lCService = new ToLowerCase();
    @Test
    public void test1(){


        assertEquals("hello", lCService.toLowerCase("Hello"));

        assertEquals("he,l234lo", lCService.toLowerCase("He,l234Lo"));

    }
}
