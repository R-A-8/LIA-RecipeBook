

/**
 * Class that contains information and functionality related to a main dish recipe.
 *
 * @Mohammad
 * @version (un numéro de version ou une date)
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
    public MainDish(String name, int serving, int spiceLevel, boolean isVegetarian)
    {
        // initialise instance variables
        super(name, serving);
        
        this.spiceLevel = spiceLevel;
        this.isVegetarian = isVegetarian;
    }

    /**
     * Indicates how spicy a main dish is depending on its spiceLevel variable.
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
    
    /**
     * Displays the properties of the main dish.
     */
    public void showProperties() {
        System.out.println("Main dish: " + getName());
        System.out.println("Spicy level: " + spiceLevel + "/10");
        listSpicy();
        System.out.println("Vegetarian: " + (isVegetarian ? "Yes" : "No"));
    }
}
