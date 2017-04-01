import Bridge.BMW;
import Bridge.ThreeSeries;
import adapter.Screw;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class BridgeTest {

    @Test
    public void BridgeTest() {

        BMW bmw = new BMW();
        ThreeSeries three = new ThreeSeries();

        assertEquals("This car can drive", "Drive", bmw.getFunction());
        assertEquals("This should have four wheels", "wheels", three.getWheels());

    }

}
