import java.util.ArrayList; 
import java.util.Iterator;

/**
 * Write a description of class RecipeBook here.
 *
 * @Rend A.
 * @version (a version number or a date)
 */
public class RecipeBook
{
    // instance variables - replace the example below with your own
    
    private String author;
    
    private String publishingCompanyName;

    private int numberOfPages;
    
    private int numberOfSections;
    
    private ArrayList<Recipe> recipes = new ArrayList<>();
    
    private Recipe rc;
    
    /**
     * Constructor for objects of class RecipeBook
     */
    public RecipeBook(String author, String publishingCompanyName, int numberOfPages, int numberOfSections)
    {
       this.author = author;
       this.publishingCompanyName = publishingCompanyName;
       this.numberOfPages = numberOfPages;
       this.numberOfSections = numberOfSections;
       printBook();
    }
    
    public void printBook(){
        bookDetails();
        rc.printRecipe();
    }
    
       public void bookDetails(){
        System.out.println("This book was written by " + author);
        System.out.println("Published in 2025 by " + publishingCompanyName);
        System.out.println("Contains " + numberOfPages + " pages and " + numberOfSections + " sections.");
        System.out.println("First edition.");
        System.out.println("To pick a recipe, choose a type: Appetizers, Main Dishes or Desserts.");
        System.out.println("To close the book, write 'close'.");
         
    }//Ready to write pseudocode
    
    public void addRecipes(Recipe recipeToAdd)
    {
        recipes.add(recipeToAdd);
    }//Ready to write pseudocode
    
    public void removeRecipes(Recipe recipeToRemove)
    {
        
        Iterator<Recipe> it = recipes.iterator();
        while(it.hasNext()){
            Recipe r = it.next();

            if(r.equals(recipeToRemove)){
                it.remove();

                for(Recipe recipe :  recipes){
                    if(recipeToRemove.equals(recipe)){
                        recipes.remove(recipe);

                    }

                }
            } //Ready to write pseudocode
        }
    }
    
    public int getRecipeCount(){
        int index = 0;
        for(Recipe recipe : recipes){
            index++;
        }
        return index;
    }//Ready to write pseudocode
    
    public void searchRecipeName(Recipe recipeName)
    {
        
        for(Recipe recipe :  recipes){
            if(recipeName.equals(recipe)){
                System.out.println(recipe);
            }
        }
    }
    
    public void printAllRecipes()
    {
        //doesn't really work as intended
        for(Recipe recipe: recipes)
        {
            System.out.println(recipe);
        }
        
    }
    
    //Voting system below:
    public void addVote(Recipe recipe)

    {
        recipe.increaseVote();
    }
    
    public void removeVote(Recipe recipe)
    {
        recipe.decreaseVote();
    }
    
    public Recipe getHighestVoted()
    {
        
        int recipeId = 0;
        if(recipes.size() == 0)
        {
            return null;
        }
        Recipe highestVoted = recipes.get(recipeId);
        
        recipeId++;
        
        while(recipeId < recipes.size())
        {
            Recipe currentRecipe = recipes.get(recipeId);
            if(currentRecipe.getVotes() > highestVoted.getVotes())
            {
                highestVoted = currentRecipe;
            }
            
            recipeId++;
        }
        
        return highestVoted;
        
    }
    
    public ArrayList<Recipe> listDessert()
    {
        ArrayList<Recipe> ds = new ArrayList<>();
        for(Recipe recipe : recipes){
            if(recipe instanceof Dessert){
                ds.add(recipe);
            }
        }
        return ds;
    }
    
    public ArrayList<Recipe> listApps()
    {

        ArrayList<Recipe> apps = new ArrayList<>();
        for(Recipe recipe : recipes){

            if(recipe instanceof Appetizer){
                apps.add(recipe);
            }
        }
        return apps;
    }
    
    public ArrayList<Recipe> listMainDish()
    {
        ArrayList<Recipe> mD = new ArrayList<>();
        for(Recipe recipe : recipes){
            if(recipe instanceof MainDish){
                mD.add(recipe);
            }
        }
        return mD;
    }
    
   
}