import Prototype.Audi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class PrototypeTest {

    @Test
    public void testPrototype(){

        Audi audi = new Audi("A4");
        Audi audi2 = (Audi)audi.makeCopy();

        assertEquals("Cloning exception", "A4",audi2.toString());

    }
}
