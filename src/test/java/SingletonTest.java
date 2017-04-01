import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import singletonPattern.SingletonPattern;

import static org.junit.Assert.assertEquals;
/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class SingletonTest {

    @Test
    public void testSingleton(){
        SingletonPattern user = SingletonPattern.getInstance();

        user.userNameSurname("Jean-Paul", "De Buys");

        assertEquals("Incorrect name and surname exception", "Jean-Paul De Buys", user.userNameSurname("Jean-Paul", "De Buys"));
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }


}
