import Bridge.BMW;
import Bridge.ThreeSeries;
import ChainOfResponsibility.A250;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class ChainOfResponsibilityTest {

    @Test
    public void BridgeTest() {

       A250 a250 = new A250();




        assertEquals("This should be an A Class", "A Class", a250.getModel());

    }
}
