package Currency;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class YenTest {

    @Test
    public void should_get_Yen_when_add_rmb() throws Exception {

        Currency yen = new Yen(10);
        Currency rmb = new RMB(2);

        assertEquals(yen.add(rmb),30,0);
    }

    @Test
    public void should_get_Yen_when_add_dollar() throws Exception {

        Currency yen = new Yen(10);
        Currency dollar = new Dollar(2);

        assertEquals(yen.add(dollar),130,0);

    }

}