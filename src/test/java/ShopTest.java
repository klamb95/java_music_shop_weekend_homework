import instruments.Guitar;
import instruments.Instrument;
import instruments.InstrumentType;
import instruments.Piano;
import nonInstruments.NonInstrument;
import org.junit.Test;
import shop.Shop;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument instrument;
    Instrument instrument2;
    NonInstrument nonInstrument;
    NonInstrument nonInstrument2;

    @Before
    public void before(){
        shop = new Shop("Kieran's Shop");
        instrument = new Guitar("Red", "Wooden", InstrumentType.STRING, 10, 20, 6, false);
        instrument2 = new Piano("Black", "Ivory", InstrumentType.KEYBOARD, 15, 20, true);
        nonInstrument = new NonInstrument("Drum Sticks", 2, 8, 12);
        nonInstrument2 = new NonInstrument("Sheet music", 4, 16, 28);
    }

    @Test
    public void shopHasName(){
        assertEquals("Kieran's Shop", shop.getName());
    }

    @Test
    public void instrumentsStartEmpty(){
        assertEquals(0, shop.getInstruments());
    }

    @Test
    public void nonInstrumentsStartEmpty(){
        assertEquals(0, shop.getNonInstruments());
    }
    
    @Test
    public void canAddInstruments(){
        shop.addInstrument(instrument);
        assertEquals(1, shop.getInstruments());
    }

    @Test
    public void canAddNonInstruments(){
        shop.addNonInstrument(nonInstrument);
        assertEquals(1, shop.getNonInstruments());
    }

    @Test
    public void canRemoveInstruments(){
        shop.addInstrument(instrument);
        shop.addInstrument(instrument2);
        shop.removeInstrument(instrument2);
        assertEquals(1, shop.getInstruments());
    }

    @Test
    public void canRemoveNonInstruments(){
        shop.addNonInstrument(nonInstrument);
        shop.addNonInstrument(nonInstrument2);
        shop.removeNonInstrument(nonInstrument);
        assertEquals(1, shop.getNonInstruments());
    }
}
