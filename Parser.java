import java.util.Scanner;

/**
 * This class is essential to be able to use this project in the terminal. It is
 * the scanner. Detects the users input. It can register two words.
 *
 * @Mohammad
 * @version (a version number or a date)
 */
public class Parser
{
    private WordCommands commands;
    private Scanner reader;

    /**
     * Constructor for objects of class Parser
     */
    public Parser()
    {
        commands = new WordCommands();
        reader = new Scanner(System.in);
    }

    /**
     * Processes the input and creates a new scanner.
     */
    public Command getCommand()
    {
        String inputLine;
        String word1 = null;
        String word2 = null;
        
        System.out.print("> ");
        
        inputLine = reader.nextLine();
        
        Scanner tokener = new Scanner(inputLine);
        if(tokener.hasNext())
        {
            word1 = tokener.next();
            if(tokener.hasNext())
            {
                word2 = tokener.next();
            }
        }
        
        if(commands.isCommand(word1))
        {
            return new Command(word1, word2);
        }
        else 
        {
            return new Command(null, word2);
        }
    }
    
    /**
     * Shows the commands words.
     */
    public void showCommands()
    {
        commands.showAll();
    }
}