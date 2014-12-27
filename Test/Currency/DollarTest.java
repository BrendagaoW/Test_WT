package Currency;

import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {
    @Test
    public void should_get_Dollar_when_add_rmb() throws Exception {

        Currency dollar = new Dollar(10);
        Currency rmb = new RMB(12);

        assertEquals(dollar.add(rmb),12,0);
    }

    @Test
    public void should_get_Dollar_when_add_dollar() throws Exception {

        Currency dollar1 = new Dollar(10);
        Currency dollar = new Dollar(2);

        assertEquals(dollar1.add(dollar),12,0);

    }

}