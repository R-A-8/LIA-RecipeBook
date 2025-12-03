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
    private String name;
    
    private HashSet ingredientsList;
    
    private ArrayList stepList;
    
    public Recipes()
    {
        ingredientsList = new HashSet<String>();
        stepList = new ArrayList<String>();
    }
    
    public void addSteps()
    {
        
    }
    
    public void removeSteps()
    {
        
    }
    
    public void addIngredients()
    {
        
    }
    
    public void removeIngredient()
    {
        
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
    
    public void listHighestRated()
    {
        
    }
    
    public void listByRating(){
        //Idk if we need this. Maybe a lowestRated 
    }
}