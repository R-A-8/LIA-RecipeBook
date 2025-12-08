
/**
 * Write a description of class Command here.
 *
 * @author (your name)
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getWordCommand()
    {
        return wordCommand;
    }
    
    public String getWord2()
    {
        return Word2;
    }
    
    public boolean isUnknown()
    {
        return wordCommand == null;
    }
    
    public boolean hasSecondWord()
    {
        return wordCommand != null;
    }
}