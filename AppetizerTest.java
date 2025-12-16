

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AppetizerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AppetizerTest
{
    /**
     * Default constructor for test class AppetizerTest
     */
    public AppetizerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void listFlavorTest()
    {
        Appetizer appetize1 = new Appetizer("Caesar Salad", 2, 6, false);
        appetize1.listFlavor();
    }
    
    @Test
    public void showPropretiesTest()
    {
         Appetizer appetize1 = new Appetizer("Caesar Salad", 2, 6, false);
        appetize1.showProperties();
    }
}
