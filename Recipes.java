import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write a description of class Recipes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipes
{
    //SIMPLE FEILDS
    private String name;
    private int duration;
    private String type;
    
    private int rating;
    
    private int votes;
    //LISTS
    private HashSet ingredientsList;
    private ArrayList stepList;
    private HashMap<String, String> ingredients = new HashMap<>();
    
    //OBJECTS
    private Step step;
    
    
    public Recipes(String name, String type)
    {
        //list initialization
        ingredientsList = new HashSet<Ingredients>();
        stepList = new ArrayList<Step>();
        
        //step = new Step();
    }
    
    public void addSteps(String instruction, int duration)
    {
        
        //add new Object to ArrayList stepList
        stepList.add(new Step(instruction, duration));
        
    }
    
    public void removeSteps(int number)
    {
        //removes the step
        stepList.remove(number);
    }

    public void addIngredients(String name, int amount)

    {
        ingredientsList.add(new Ingredients(name, amount));
        //my bad for stealing like everything even text down there |
        //                                                        \ /
        //number of that specific ingredient to use in the recipe (e.g.: "4", "eggs");
    }
    
    public void removeIngredients(String number, String ingredient)
    {
        if(ingredient.equals(ingredients))
        {
            ingredients.remove(ingredient);
        }
    }
    
    
    public boolean addRating(int rating)
    {
        if(ratingInvalid(rating)) {  // reject invalid ratings
            return false;
        }
        return true;
    }//From online-shop-JUnit
    
    private boolean ratingInvalid(int rating)
    {
        return rating < 0 || rating > 5;
    } //From online-shop-JUnit
    
    public int getRating()
    {
        return rating;
    }
    
    public void increaseVote()
    {
        votes++;
    }
    
    public void decreaseVote()
    {
        votes--;
    }
    
    public int getVotes()
    {
        return votes;
    }
    
}