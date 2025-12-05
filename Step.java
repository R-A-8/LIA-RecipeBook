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
    
    public int duration;
    private ArrayList listOfSteps;
    
    /**
     * Constructor for objects of class Steps
     */
    public Step(String instruction, int duration)
    {
        // initialise instance variables
        listOfSteps = new ArrayList<String>();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public void listAllSteps()
    {
        for(int i = 0; i > listOfSteps.size(); i++)
        {
            System.out.print(listOfSteps.get(i));
        }
    }
}