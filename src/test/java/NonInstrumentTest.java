import nonInstruments.NonInstrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonInstrumentTest {

    NonInstrument nonInstrument;

    @Before
    public void before(){
        nonInstrument = new NonInstrument("Drum Sticks", 2, 8, 12);
    }

    @Test
    public void nonInstrumentHasName(){
        assertEquals("Drum Sticks", nonInstrument.getName());
    };

    @Test
    public void nonInstrumentHasNumberOfItems(){
        assertEquals(2, nonInstrument.getNumberOfItems());
    };

    @Test
    public void nonInstrumentHasPriceBought(){
        assertEquals(8, nonInstrument.getPriceBought());
    };

    @Test
    public void nonInstrumentHasPriceSold(){
        assertEquals(12, nonInstrument.getPriceSold());
    };

    @Test
    public void nonInstrumentHasMarkUp(){
        assertEquals(4, nonInstrument.markUp());
    }
}
