import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Golden", "Brass", InstrumentType.BRASS, 30, 38, 4);
    }

    @Test
    public void trumpetHasColour(){
        assertEquals("Golden", trumpet.getColour());
    }

    @Test
    public void trumpetHasMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void trumpetHasType(){
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void trumpetHasPriceBought(){
        assertEquals(30, trumpet.getPriceBought());
    }

    @Test
    public void trumpetHasPriceSold(){
        assertEquals(38, trumpet.getPriceSold());
    }


    @Test
    public void trumpetCanPlay(){
        assertEquals("I am tooting", trumpet.play());
    }

    @Test
    public void trumpetHasMarkUp(){
        assertEquals(8, trumpet.markUp());
    }

}
