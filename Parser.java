import java.util.Scanner;

/**
 * Write a description of class Parser here.
 *
 * @author (your name)
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
    
    public void showCommands()
    {
        commands.showAll();
    }
}