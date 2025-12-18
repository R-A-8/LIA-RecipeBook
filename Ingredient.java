
import java.util.HashSet;
import java.util.ArrayList;

/**
 * Class that holds information and functionality that relates to an ingredient.
 *
 * @Rend A.
 * @version (a version number or a date)
 */
public class Ingredient
{
    // instance variables - replace the example below with your own
    private String name;
    private int amount;  
    private int scaling;
    private Unit unit;
    
    private HashSet<String> inList;
    

    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    /**
     * Constructor for objects of class Ingredients
     */
    public Ingredient(String name, int amount, Unit unit)

    {
        this.amount = amount;
        this.name = name;
        this.unit = unit;
       
        
        //to test if it works
        System.out.println("Ingredient added: " + amount + unit + " of " + name);
    } 
    
    /**
     * Displays the properties of an ingredient.
     */
    public void getProperties()
    {
        System.out.println("Ingredient name: " + getName());
        System.out.println("amount " + getAmount() + "" + getUnit());
        System.out.println("");
    }
    
    /**
     * Getter that returns the name of the ingredient.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Getter that returns the quantity of the ingredient.
     */
    public int getAmount()
    {
        return amount;
    }
    
    /**
     * Getter that returns the unit of mesurement of the ingredient.
     */
    public Unit getUnit()
    {
        return unit;
    }

    /**
     * Increases the quantity of a certain ingredient by a factor.
     */
    public int scaleIngredients(int scale){
        //e.g.: the recipe serves 3 people, so we need 3 carrots, but the user wants to 
        //serve 5 people. Therefore, the carrots need to be scaled.

        amount = amount*scale;
        return amount;
    }
    
    /**
     * Displays all ingredients.
     */
    public void printIngredients()
    {
        System.out.println(ingredients);
    }

}
