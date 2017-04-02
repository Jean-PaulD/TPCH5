import Strategy.Context;
import Strategy.OperationAdd;
import Visitor.ActualCar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-04-02.
 */
public class StrategyTest {
    @Test
    public void testStrategy(){




        Context context = new Context(new OperationAdd());


        assertEquals("Adding exception", 15, context.executeStrategy(10, 5));
    }
}



