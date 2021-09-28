import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantBeeTest {
    GiantBee GiantBee;

    @Before
    public void setUp() {
        GiantBee = new GiantBee();
    }

    @Test
    public void TestSound() {
        assertEquals("Bzzzz", GiantBee.sound());
    }

    @Test
    public void TestUpgradeSpeed() {
        GiantBee.upgradeSpeed();
        assertEquals(14, GiantBee.getMaxSpeed());
    }

    @Test
    public void TestDowngradeSpeed() {
        GiantBee.downgradeSpeed();
        assertEquals(10, GiantBee.getMaxSpeed());
    }
}