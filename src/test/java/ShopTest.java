import instruments.instrumentTypes.GuitarType;
import instruments.instrumentTypes.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shopItems.RockstarGuitar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {
    Shop shop;
    RockstarGuitar RCguitar;

    @Before
    public void setUp() {
        shop = shop.getInstance();
        RCguitar = new RockstarGuitar(InstrumentType.STRING,
                "Wood",
                "Yamaha",
                "Royal Saphere",
                6, GuitarType.ACOUSTIC,
                1000.00,
                1999.99,
                "The guitar's GOD");
        shop.clearInventory();
    }
    @Test
    public void startsWithEmptyInventory() {
        assertEquals(0, shop.getInventory().size());
    }

    @Test
    public void canAddToInventory() {
        shop.addToInventory(RCguitar);
        assertEquals(1, shop.getInventory().size());
    }

    @Test
    public void canRemoveFromInventory() {
        shop.addToInventory(RCguitar);
        shop.addToInventory(RCguitar);
        shop.removeFromInventory(RCguitar);
        assertEquals(1, shop.getInventory().size());
        assertTrue(shop.getInventory().contains(RCguitar));
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        shop.addToInventory(RCguitar);
        shop.addToInventory(RCguitar);

        assertEquals(RCguitar.calculateMarkup() +
                RCguitar.calculateMarkup(), shop.calculatePotentialProfit(), 0);
    }

}
