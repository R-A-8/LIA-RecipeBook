
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write a description of class Recipes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{

    private String name;
    private int duration;
    
    private int rating;
    
    private int votes;
    //LISTS
    
    private ArrayList stepList;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    
    //OBJECTS
    private Step step;
    private Unit unit;
    
    public Recipe(String name)
    {
        //list initialization
        this.name = name;
        
        stepList = new ArrayList<Step>();
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

    public Ingredient addIngredient(String name, int amount, Unit unit)
    {
        return new Ingredient(name, amount, unit);
    }
    
    public void showUnits()
    {
        for(Unit unit : unit.values())
        {
            System.out.println(unit);
        }
    }
    
    public void addIngredient(Ingredient ingredientToAdd)
    {
        ingredients.add(ingredientToAdd);
    }
    
    public void removeIngredients(Ingredient ingredientToRemove)
    {
        for(Ingredient ingredient : ingredients){
            if(ingredientToRemove.equals(ingredient)){
                ingredients.remove(ingredient);
            }
        }
    }
    
    public boolean addRating(int rating)
    {
        if(ratingInvalid(rating)) {  // reject invalid ratings
            return false;
        }
        this.rating = rating;
        return true;
    }//From online-shop-JUnit
    
    private boolean ratingInvalid(int rating)
    {
        return rating < 0 || rating > 5;
    } //From online-shop-JUnit
    
    public void increaseVote()
    {
        votes++;
    }  
    
    public void decreaseVote()
    {
        votes--;
    }
    
    //Getters below:
    public int getRating()
    {
        return rating;
    }
    
    public int getVotes()
    {
        return votes;
    }
    
}
