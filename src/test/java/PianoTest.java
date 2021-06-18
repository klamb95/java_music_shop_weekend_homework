import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Black", "Ivory", InstrumentType.KEYBOARD, 15, 20, true);
    }

    @Test
    public void pianoHasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void pianoHasMaterial(){
        assertEquals("Ivory", piano.getMaterial());
    }

    @Test
    public void pianoHasType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void pianoHasPriceBought(){
        assertEquals(15, piano.getPriceBought());
    }

    @Test
    public void pianoHasPriceSold(){
        assertEquals(20, piano.getPriceSold());
    }

    @Test
    public void pianoIsElectric(){
        assertEquals(true, piano.isElectric());
    }

    @Test
    public void pianoCanPlay(){
        assertEquals("I am mashing the keys", piano.play());
    }

    @Test
    public void pianoHasMarkUp(){
        assertEquals(5, piano.markUp());
    }

}
