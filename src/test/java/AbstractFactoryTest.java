import abstractFactory.CarEngine;
import abstractFactory.CarEngineFactory;
import abstractFactory.PostFaceLift;
import abstractFactory.PostFaceLiftFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class AbstractFactoryTest {

    @Test
    public void AbstractTest() {

        PostFaceLiftFactory postFaceLiftFactory = new PostFaceLiftFactory();


        assertEquals("This car should be a post facelift", "V6 turbo", postFaceLiftFactory.getEngineName("V6 turbo").getEngineName());

    }
}
