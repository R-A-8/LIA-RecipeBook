
/**
 * Hosts all commands words that helpp the program function on the terminal.
 *
 * @Mohammad
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
    public WordCommands(){}

    /**
     * Checks whether the user input is a command word or not.
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
    
    /**
     * Shows all command words.
     */
    public void showAll()
    {
        for(String command: availibleCommands)
        {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}