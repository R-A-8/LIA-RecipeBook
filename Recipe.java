
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
    private ArrayList<Step> steps = new ArrayList<>();
    
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

    
    
    public void increaseVote()
    {
        votes++;
    }  
    
    public void decreaseVote()
    {
        votes--;
    }
    
    public void addSteps(Step s)
    {
        steps.add(s);        
    }
    //Getters below:

    
    public int getVotes()
    {
        return votes;
    }
    
    
    public void printRecipe()
    {
        System.out.println("Title: " + name);
        System.out.println("Ingredients:");
        for(Ingredient i : ingredients){
            System.out.print("-" + i + "n/");
        }
        System.out.println("Steps:");
        for(Step s : steps){
            System.out.print("-" + s + "n/");
        }
    
        if(votes > 0) {
            System.out.println("  -  " + votes + " people like this.");
        }
        else {
            System.out.println();
        }
        

    }
}
