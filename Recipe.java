
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * This class acts as somewhat a crossroads. It's a parent class that manages step/ingredient
 * creation as well as the voting system functionality. 
 *
 * @Mohammad Al Mousa
 */
public class Recipe
{

    private String name;
    
    private int serving;
    
    private int duration;
    
    private int rating;
    
    private int votes;
    //LISTS
    
    
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private ArrayList<Step> steps = new ArrayList<>();
    
    //OBJECTS
    private Step step;
    private Unit unit;
    
    /**
     * Constructor for objects of class RecipeBook.
     */
    public Recipe(String name, int serving)
    {
        //list initialization
        this.name = name;
        this.serving = serving;
    }

    /**
     * Adds step to recipe.
     */
    public void addStep(Step step)
    {
        steps.add(step);   
    }
    
    /**
     * Remove step from recipe.
     */
    public void removeStep(String instruction)
    {
        
        Step stepToRemove = searchStep(instruction);
        
        Iterator<Step> it = steps.iterator();
        while(it.hasNext()){
            Step s = it.next();

            if(s.equals(stepToRemove)){
                it.remove();

                for(Step step :  steps){
                    if(stepToRemove.equals(step)){
                        steps.remove(step);

                    }

                }
            } //Ready to write pseudocode
        }
    }
    
    /**
     * Remove step from recipe.
     */
    public Step searchStep(String instruction) {
        for (Step s : steps) {
            if (s.getInstruction().equalsIgnoreCase(instruction)) {
                return s;
            }
        }
        return null;
    }
    
    /**
     * Displays the amount of units of mesurement availible.
     */
    public void showUnits()
    {
        for(Unit unit : unit.values())
        {
            System.out.println(unit);
        }
    }
    
    /**
     * Add an already existing ingredient object to the ingredients arraylist.
     */
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

    
    /**
     * Remove an already existing ingredient object from the ingredients arraylist.
     */
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
    
    /**
     * Search for an ingredient by name inside a specific recipe.
     */
    public Ingredient searchIngredient(String name) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equalsIgnoreCase(name)) {
                return ingredient;
            }
        }
        return null;
    }
    
    /**
     * Adds 1 to the int value votes.
     */
    public void increaseVote()
    {
        votes++;
    }  
    
    /**
     * Subtracts 1 from the int value votes.
     */
    public void decreaseVote()
    {
        votes--;
    }

    //Getters below:

    /**
     * Subtracts 1 from the int value votes.
     */
    public int getVotes()
    {
        return votes;
    }
    
    /**
     * Displays the full infromation about a recipe.
     */
    public void printRecipe()
    {
        System.out.println("Title: " + name);
        
        System.out.println("\n" + "Serves " + serving + " people.");
        
        System.out.println("\n" + "Ingredients:");
        for(Ingredient i : ingredients){
            System.out.println("-" + i.getAmount() + i.getUnit() + " of " + i.getName() + "\n");
        }
        
        System.out.println("\n" + "Steps:");
        for(Step s : steps){
            
            System.out.print("-" + s.getInstruction()+ "\n");
        }
    
        if(votes > 0) {
            System.out.println("  -  " + votes + " people like this.");
        }
        else {
            System.out.println();
        }
        

    }
    
    /**
     * Getter that returns name String.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Lists all ingredients and information about each.
     */
    public void listIngredients()
    {
        for(int i = 0; i < ingredients.size(); i++)
        {
            System.out.println("Ingredient name: " + ingredients.get(i).getName());
            System.out.println("amount: " + ingredients.get(i).getAmount() + "" + ingredients.get(i).getUnit());
            System.out.println("");
        }
    }
    
    /**
     * Lists all steps inside of a recipe.
     */

    public void listSteps()
    {
        for(int i = 0; i < steps.size(); i++)
        {
            System.out.println(steps.get(i).getOrder() + ": " + steps.get(i).getInstruction());
        }
    }
    
    /**
     * Shows the properties of a recipe.
     */

    public void showProperties() {
        System.out.println("Recipe: " + name);
    }
}
