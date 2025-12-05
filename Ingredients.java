import java.util.HashSet;
import java.util.ArrayList;

/**
 * Write a description of class Ingredients here.
 *
 * @Rend A.
 * @version (a version number or a date)
 */
public class Ingredients
{
    // instance variables - replace the example below with your own
    private String name;
    private int amount;
    private int scaling;
    
    private HashSet<String> inList;
    

    private ArrayList<Ingredients> ingredients = new ArrayList<>();

    //private HashMap<String, String> ingredients = new HashMap<>();


    /**
     * Constructor for objects of class Ingredients
     */



    public Ingredients(String name, int amount)

    {
        this.name = name;
        this.amount = amount;
        
        //inList = new HashSet<>();
    } 

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public void addIngredients(Ingredients ingredientToAdd)
    {
        ingredients.add(ingredientToAdd);
    }

 

    public void removeIngredients(Ingredients ingredientToRemove)
    {
        for(Ingredients ingredient : ingredients){
            if(ingredientToRemove.equals(ingredient)){
                ingredients.remove(ingredient);
            }
        }
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