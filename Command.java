
/**
 * A Getter method central. Place to retreive information about the first and second
 * word inputs.
 *
 * @Mohammad
 * @version (a version number or a date)
 */
public class Command
{
    private String wordCommand;
    private String Word2;

    /**
     * Constructor for objects of class Command
     */
    public Command(String Word1, String Word2)
    {
        wordCommand = Word1;
        this.Word2 = Word2;
    }

    /**
     * Getter that returns the command word as string.
     */
    public String getWordCommand()
    {
        return wordCommand;
    }
    
    /**
     * Getter that returns the second word input as string.
     */
    public String getWord2()
    {
        return Word2;
    }
    
    /**
     * Getter that returns a wordCommand equals null as a boolean.
     */
    public boolean isUnknown()
    {
        return wordCommand == null;
    }
    
    /**
     * Getter that checks whether there is a second word input. 
     */
    public boolean hasSecondWord()
    {
        return Word2 != null;
    }
}