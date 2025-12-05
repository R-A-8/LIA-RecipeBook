import java.util.ArrayList;

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
    
    private ArrayList<Recipes> recipes = new ArrayList<>();
    
    
<<<<<<< HEAD
    private Recipes recipe = new Recipes();
    
    
    
=======
    //private Recipes recipe = new Recipes();
>>>>>>> 14d2c2dfd79542d2183abf33756819713198f6c2

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
    }
    
       public void bookDetails(){
        System.out.println("This book was written by " + author);
        System.out.println("Published in 2025 by " + publishingCompanyName);
        System.out.println("Contains " + numberOfPages + " pages and " + numberOfSections + " sections.");
        System.out.println("First edition.");
        System.out.println("To pick a recipe, choose a type: Appetizers, Main Dishes or Desserts.");
        System.out.println("To close the book, write 'close'.");
        
    }//Ready to write pseudocode
    
    public void addRecipes(String name, String type)
    {
        
        recipes.add(new Recipes(name, type));
    }//Ready to write pseudocode
    
    public void removeRecipes(Recipes recipeToRemove)
    {
        for(Recipes recipe :  recipes){
            if(recipeToRemove.equals(recipe)){
                recipes.remove(recipe);
            }
        }
    } //Ready to write pseudocode
    
    public int getRecipeCount(){
        int index = 0;
        for(Recipes recipe : recipes){
            index++;
        }
        return index;
    }//Ready to write pseudocode
    
    public void searchRecipeName(Recipes recipeName)
    {
        for(Recipes recipe :  recipes){
            if(recipeName.equals(recipe)){
                System.out.println(recipe);
            }
        }
    }
    
    public void printAllRecipes()
    {
        System.out.println(recipes);
    }
    
<<<<<<< HEAD
    public ArrayList<Recipes> listDessert()
=======
    //Voting system below:
    public void addVote(Recipes recipe)
    {
        recipe.increaseVote();
    }
    
    public void removeVote(Recipes recipe)
    {
        recipe.decreaseVote();
    }
    
    public Recipes getHighestVoted()
    {
        int recipeId = 0;
        if(recipes.size() == 0)
        {
            return null;
        }
        Recipes highestVoted = recipes.get(recipeId);
        
        recipeId++;
        
        while(recipeId < recipes.size())
        {
            Recipes currentRecipe = recipes.get(recipeId);
            if(currentRecipe.getVotes() > highestVoted.getVotes())
            {
                highestVoted = currentRecipe;
            }
            
            recipeId++;
        }
        
        return highestVoted;
        
    }
    
    public void listDessert()
>>>>>>> 14d2c2dfd79542d2183abf33756819713198f6c2
    {
        ArrayList<Recipes> ds = new ArrayList<>();
        for(Recipes recipe : recipes){
            if(recipe instanceof Desserts){
                ds.add(recipe);
            }
        }
        return ds;
    }
    
    public ArrayList<Recipes> listApps()
    {
        ArrayList<Recipes> apps = new ArrayList<>();
        for(Recipes recipe : recipes){
            if(recipe instanceof Appatiser){
                apps.add(recipe);
            }
        }
        return apps;
    }
    
    public ArrayList<Recipes> listMainDish()
    {
        ArrayList<Recipes> mD = new ArrayList<>();
        for(Recipes recipe : recipes){
            if(recipe instanceof MainDish){
                mD.add(recipe);
            }
        }
        return mD;
    }
    
   
}