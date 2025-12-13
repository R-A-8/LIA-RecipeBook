
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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
    }
    
    public void addStep(Step step)
    {
        steps.add(step);   
    }
    
    public void removeStep(int number)
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
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equals(ingredientToAdd.getName())) {
                System.out.println("Can't have two ingredients with the same name!");
                return;
            }
        }
        ingredients.add(ingredientToAdd);
    }


    public void removeIngredient(String ingredientName)
    {
        
        Ingredient ingredientToRemove = searchIngredient(ingredientName);
        
        Iterator<Ingredient> it = ingredients.iterator();
        while(it.hasNext()){
            Ingredient r = it.next();

            if(r.equals(ingredientToRemove)){
                it.remove();

                for(Ingredient ingredient :  ingredients){
                    if(ingredientToRemove.equals(ingredient)){
                        ingredients.remove(ingredient);

                    }

                }
            } //Ready to write pseudocode
        }
    }
    
    public Ingredient searchIngredient(String name) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equalsIgnoreCase(name)) {
                return ingredient;
            }
        }
        return null;
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
    
    public String getName()
    {
        return name;
    }
    
    public void listIngredients()
    {
        for(int i = 0; i < ingredients.size(); i++)
        {
            System.out.println("Ingredient name: " + ingredients.get(i).getName());
            System.out.println("amount: " + ingredients.get(i).getAmount() + "" + ingredients.get(i).getUnit());
            System.out.println("");
        }
    }
    
    public void listSteps()
    {
        for(int i = 0; i < steps.size(); i++)
        {
            System.out.println(steps.get(i).getOrder() + ": " + steps.get(i).getInstruction());
        }
    }
    
    public void showProperties() {
        System.out.println("Recipe: " + name);
    }
}
