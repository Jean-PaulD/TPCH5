import Visitor.ActualCar;
import Visitor.CarPart;
import org.junit.Test;
import singletonPattern.SingletonPattern;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-04-02.
 */
public class VisitorTest {


    @Test
    public void testVisitor(){

        ActualCar carPart = new ActualCar();




        assertEquals("Incorrect engine", "engine", carPart.engine());
    }
}
