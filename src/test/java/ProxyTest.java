import org.junit.Test;
import proxy.ProxyStudent;
import proxy.Student;
import singletonPattern.SingletonPattern;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-04-02.
 */
public class ProxyTest {

    @Test
    public void testProxy(){
        Student student = new ProxyStudent("211064084");

        assertEquals("Not student number exception", "Displaying: 211064084", student.showStudentNumber());
    }
}
