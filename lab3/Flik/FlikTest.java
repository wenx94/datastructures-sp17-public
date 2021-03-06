import static org.junit.Assert.*;

import org.junit.Test;

public class FlikTest {

    @Test
    public void testFlik128() {
        assertTrue(Flik.isSameNumber(127, 127));
        assertTrue(128 == 128);
        Integer a = 128;
        Integer b = 128;
        assertTrue(a == b);
        assertTrue(Flik.isSameNumber(128, 128));
    }
}
