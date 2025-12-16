
/**
 * Write a description of class WordCommands here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordCommands
{
    // instance variables - replace the example below with your own
    private static final String[] availibleCommands = {
        "quit", "help", "add", "remove", "vote", "show", "edit"
    };

    

    /**
     * Constructor for objects of class WordCommands
     */
    public WordCommands()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < availibleCommands.length; i++)
        {
            if(availibleCommands[i].equals(aString))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public void showAll()
    {
        for(String command: availibleCommands)
        {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}