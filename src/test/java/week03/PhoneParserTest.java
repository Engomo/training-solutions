package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneParserTest {
    @Test
    public void tastParse(){

        PhoneParser parser = new PhoneParser();
        String s = "20-5292558";

        Phone phone = parser.parse(s);

        assertEquals("20-5292558", phone.toString());
    }
}
