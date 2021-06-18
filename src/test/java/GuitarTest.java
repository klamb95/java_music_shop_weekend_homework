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

    @Test
    public void guitarHasMaterial(){
        assertEquals("Wooden", guitar.getMaterial());
    }

    @Test
    public void guitarHasType(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void guitarHasPriceBought(){
        assertEquals(10, guitar.getPriceBought());
    }

    @Test
    public void guitarHasPriceSold(){
        assertEquals(20, guitar.getPriceSold());
    }

    @Test
    public void guitarHasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarIsElectric(){
        assertEquals(false, guitar.isElectric());
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("I am strumming", guitar.play());
    }

    @Test
    public void guitarHasMarkUp(){
        assertEquals(10, guitar.markUp());
    }

}
