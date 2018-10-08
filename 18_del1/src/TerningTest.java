import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TerningTest {

    Terning T = new Terning();

    @Test
    public void kast() {
        for (int i = 0; i < 60000; i++) {
            int tal = T.kast();
            assertTrue(tal > 0 && tal < 7);
        }

    }
}