import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Red", "Wooden", InstrumentType.STRING, 10, 20, 6, false);
    }

    @Test
    public void guitarHasColour(){
        assertEquals("Red", guitar.getColour());
    }

}
