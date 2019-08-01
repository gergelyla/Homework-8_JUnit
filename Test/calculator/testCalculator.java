package calculator;

import org.junit.*;

import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class testCalculator {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }

    @Before
    public void setup() {
        System.out.println("in setup");
    }

    @After
    public void after() {
        System.out.println("after");
    }
}
