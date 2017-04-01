import abstractFactory.PostFaceLiftFactory;
import adapter.Screw;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class AdapterTest {


    @Test
    public void AbstractTest() {

        Screw screw = new Screw();
        screw.getScrewDriver().setType("Phillips");


        assertEquals("This screw can only be turned with a flat screw driver", "Phillips", screw.getScrewDriver().getType());

    }

}
