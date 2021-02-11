import junit.framework.TestCase;

import java.util.Arrays;


public class RegisterTest extends TestCase {
    Register registerTest;

    public void setUp() throws Exception {
        super.setUp();
        Student student1 = new Student(Arrays.asList(89.0,41.2,56.7));
        Student student2 = new Student(Arrays.asList(88.0,41.4,76.7));
        Student student3 = new Student(Arrays.asList(84.0,71.2,36.7)) {{
            setName("Charles");
        }};

        student1.setName("kofi");
        student2.setName("Desmond");


        registerTest = new Register(Arrays.asList(student1,student2,student3));
    }

    public void testGetRegister() {
        System.out.println(registerTest.getRegister());
        assertTrue(registerTest.getRegister().containsAll(Arrays.asList("kofi","Charles","Desmond")));
    }
}