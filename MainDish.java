

/**
 * Write a description of class MainDish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainDish extends Recipe
{
    // instance variables - replace the example below with your own
    private int spiceLevel;
    private boolean isVegetarian;
    
    private String name;
    
    

    /**
     * Constructor for objects of class MainDish
     */
    public MainDish(String name)
    {
        // initialise instance variables
        super(name);
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void listSpicy()
    {
        if(spiceLevel == 0)
        {
            System.out.println("Not spicy");
        }
        if(spiceLevel < 5 && spiceLevel > 0)
        {
            System.out.println("Mildly spicy");
        }
        if(spiceLevel == 5)
        {
            System.out.println("spicy");
        }
        if(spiceLevel > 5)
        {
            System.out.println("Really spicy");
        }
        if(spiceLevel > 10 && spiceLevel < 0)
        {
            System.out.println("Invalid spice level");
        }
    }
}
