import org.junit.*;

import static org.junit.Assert.*;


public class busTest {
    bus b;

    @Before
    public void setUp(){
        b = new bus();
    }

    public void TestGetMaxSpeed() {
        assertEquals(420420, b.getMaxSpeed());
    }


}