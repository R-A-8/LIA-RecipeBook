
import java.util.HashSet;
import java.util.ArrayList;

/**
 * Write a description of class Ingredients here.
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
    
    private HashSet<String> inList;
    

    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    /**
     * Constructor for objects of class Ingredients
     */



    public Ingredient(String name, int amount, Unit unit)

    {
        this.amount = amount;
        this.name = name;
        
        //to test if it works
        System.out.println("Ingredient added: " + amount + unit + " of " + name);
    } 


    public int scaleIngredients(int scale){
        //e.g.: the recipe serves 3 people, so we need 3 carrots, but the user wants to 
        //serve 5 people. Therefore, the carrots need to be scaled.

        amount = amount*scale;
        return amount;
    }
    
    public void printIngredients()
    {
        System.out.println(ingredients);
    }

}
