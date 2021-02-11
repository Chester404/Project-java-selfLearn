import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class BagTest {

    Bag<Student> studentBag ;
    Student stud1;

    @Before
    public void setUp() throws Exception {
        studentBag = new Bag<>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addItem() {
        stud1 = new Student(Collections.singletonList((34.2)),Level.LEVEL100);
        studentBag.addItem(stud1);


        assertTrue(studentBag.items.contains(stud1));
    }

    @Test
    public void removeItem() {
    }

    @Test
    public void clearAllItem() {
    }
}