import instruments.instrumentTypes.GuitarType;
import instruments.instrumentTypes.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shopItems.RockstarGuitar;

import static org.junit.Assert.assertEquals;

public class RockstarGuitarTest {
    RockstarGuitar RCguitar;

    @Before
    public void setUp() {
        RCguitar = new RockstarGuitar(InstrumentType.STRING,
                "Wood",
                "Yamaha",
                "Royal Saphere",
                6, GuitarType.ACOUSTIC,
                1000.00,
                1999.99,
                "The guitar's GOD");
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, RCguitar.getNumberOfStrings());
    }

    @Test
    public void hasGuitarType() {
        assertEquals(GuitarType.ACOUSTIC, RCguitar.getGuitarType());
    }


    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRING, RCguitar.getInstrumentType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", RCguitar.getMaterial());
    }

    @Test
    public void hasSupplier() {
        assertEquals("Yamaha", RCguitar.getSupplier());
    }

    @Test
    public void hasColour() {
        assertEquals("Royal Saphere", RCguitar.getColour());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(1000.00, RCguitar.getBuyPrice(), 0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(1999.99, RCguitar.getSellPrice(), 0);
    }

    @Test
    public void hasDescription() {
        assertEquals("The guitar's GOD", RCguitar.getDescription());
    }

    @Test
    public void canPlay() {
        assertEquals("Play some notes", RCguitar.play());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(999.99, RCguitar.calculateMarkup(), 0);
    }

}
