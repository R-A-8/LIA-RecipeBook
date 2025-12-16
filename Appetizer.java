

public class Appetizer extends Recipe
{
    // instance variables - replace the example below with your own
    private int flavorLevel;
    
    private String name;
    
    private boolean isGlutenFree;
    private boolean isVegetarian;

    /**
     * Constructor for objects of class appatisers
     */
    public Appetizer(String name, int serving, int flavorLevel, boolean isVegetarian)
    {
        super(name, serving);
        
        this.flavorLevel = flavorLevel;
        this.isVegetarian = isVegetarian;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void listFlavor()
    {
        if(flavorLevel == 0)
        {
            System.out.println("No flavor");
        }
        if(flavorLevel < 5 && flavorLevel > 0)
        {
            System.out.println("Low flavor");
        }
        if(flavorLevel == 5)
        {
            System.out.println("Moderately flavorful");
        }
        if(flavorLevel > 5)
        {
            System.out.println("Really flavorful");
        }
        if(flavorLevel > 10 && flavorLevel < 0)
        {
            System.out.println("Invalid flavor level");
        }
    }
    
    public void showProperties() {
        System.out.println("Appatizer: " + getName());
        System.out.println("Flavor level: " + flavorLevel + "/10");
        listFlavor();
        System.out.println("Vegetarian: " + (isVegetarian ? "Yes" : "No"));
        
    }
}