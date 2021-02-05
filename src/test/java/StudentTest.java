import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest extends TestCase {
    Student one;

    public void setUp() throws Exception {
        super.setUp();
        List l= Arrays.asList(1.0, 2.0, 3.0);

        one = new Student(l);
    }

    public void testGetAverageGrade() {

        assertEquals(2.0,one.getAverageGrade());
    }
}