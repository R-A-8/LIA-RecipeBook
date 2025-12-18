import java.util.ArrayList;

/**
 * Write a description of class Steps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Step
{
    // instance variables - replace the example below with your own
    public String instruction;
    
    public int order;
    private ArrayList listOfSteps;
    
    /**
     * Constructor for objects of class Steps
     */
    public Step(int order, String instruction)
    {
        this.order = order;
        this.instruction = instruction;
    
        // initialise instance variables
        listOfSteps = new ArrayList<String>();
        
    }

    /**
     * Getter that returns the instruction string.
     */
    
    
    public String getInstruction()
    {
        return instruction;
    }
    
    /**
     * Getter that returns the order integer.
     */
    public int getOrder()
    {
        return order;
    }
}