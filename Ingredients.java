import java.util.HashSet;
import java.util.HashMap;

/**
 * Write a description of class Ingredients here.
 *
 * @Rend A.
 * @version (a version number or a date)
 */
public class Ingredients
{
    // instance variables - replace the example below with your own
    
    private String textureLevel;
    private String color;
    private HashSet inList;
    
    private HashMap<String, String> ingredients = new HashMap<>();

    /**
     * Constructor for objects of class Ingredients
     */
    public Ingredients()
    {
        inList = new HashSet<String>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addIngredients(String number, String ingredient)
    {
        ingredients.put(number, ingredient); 
        //number of that specific ingredient to use in the recipe (e.g.: "4", "eggs");
    }
    
    public void removeIngredients(String number, String ingredient)
    {
        if(ingredient.equals(ingredients)){
            ingredients.remove(ingredient);
        }
    }
}