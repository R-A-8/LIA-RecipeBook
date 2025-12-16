import java.util.ArrayList; 
import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;


/**
 * Write a description of class RecipeBook here.
 *
 * @Rend A.
 * @version (a version number or a date)
 */
public class RecipeBook
{
    // instance variables - replace the example below with your own
    
    //parser:
    private Parser parser;
    
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
       parser = new Parser();
    }
    
       public void bookDetails(){
        System.out.println("This book was written by " + author);
        System.out.println("Published in 2025 by " + publishingCompanyName);
        System.out.println("Contains " + numberOfPages + " pages and " + numberOfSections + " sections.");
        System.out.println("First edition.");
        System.out.println("To view all commands,  WRITE 'help'.");
        System.out.println("To close the book, write 'quit'.");
        
         
    }//Ready to write pseudocode
    
    public void addRecipes(Recipe recipeToAdd)
    {
        for (Recipe recipe : recipes) {
            if (recipe.getName().equals(recipeToAdd.getName())) {
                System.out.println("Can't have two recipes with the same name!");
                return;
            }
        }
        recipes.add(recipeToAdd);
        System.out.println("Recipe created: " + recipeToAdd.getName());
    }//Ready to write pseudocode
    
    public void removeRecipes(String recipeName)
    {
        
        Recipe recipeToRemove = searchRecipeName(recipeName);
        
        Iterator<Recipe> it = recipes.iterator();
        while(it.hasNext()){
            Recipe r = it.next();

            if(r.equals(recipeToRemove)){
                it.remove();

                for(Recipe recipe :  recipes){
                    if(recipeToRemove.equals(recipeToRemove)){
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
    
    public Recipe searchRecipeName(String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                return recipe;
            }
        }
        return null;
    }
    
    public void printAllRecipes()
    {
        for (Recipe recipe : recipes) {
            recipe.showProperties();
            System.out.println("-------------------");
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
    
    public void getHighestVoted()
    {
        
        int recipeId = 0;
        if(recipes.size() == 0)
        {
            System.out.println("there are no recipes.");
            return;
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
        
        System.out.println("highest voted recipe is " + highestVoted.getName());
        
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
    
    public void run()
    {
        bookDetails();
        
        boolean finished = false;
        while(! finished)
        {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Book closed.");
    }
    
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;
        
        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String Wordcommand = command.getWordCommand();
        
        //quit
        if (Wordcommand.equals("quit")) {
            wantToQuit = quit(command);
        }
        
        //add/remove functionality
        if (Wordcommand.equals("add"))
        {
            add(command);
        }
        if (Wordcommand.equals("remove"))
        {
            remove(command);
        }
        
        //List functionalities
        if(Wordcommand.equals("help"))
        {
            help();
        }
        if(Wordcommand.equals("show"))
        {
            show(command);
        }
        
        //voting system
        if(Wordcommand.equals("vote"))
        {
            Vote(command);
        }
        
        return wantToQuit;
    }
    
    //QUIT:
    
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            // signal that we want to quit
            return true;
        }
    }
     
    //ADD AND REMOVE:
    
    private void add(Command command) {
        if(command.getWord2() == null)
        {
            System.out.println("add what?");
            return;
        }
        
        if (command.getWord2().equals("ingredient")) {
            if (recipes.size() > 0) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Which recipe do you want to add an ingredient to? ");
                String recipeName = scanner.nextLine();
                Recipe target = searchRecipeName(recipeName);
                if (target == null) {
                    System.out.println("Recipe not found.");
                    return;
                }

                System.out.print("What's the name of the ingredient? ");
                String name = scanner.nextLine();

                System.out.print("What's the amount? ");
                int amount = Integer.parseInt(scanner.nextLine());

                System.out.print("What's the unit (kg, g, pc, tbsp, tsp, ml, l, lb, oz, cups)");
                String unitInput = scanner.nextLine();

                try {
                    Unit unit = Unit.valueOf(unitInput);
                    Ingredient newIngredient = new Ingredient(name, amount, unit);
                    target.addIngredient(newIngredient);
                    System.out.println("Ingredient created: " + newIngredient + " added to " + target.getName());
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid unit. Please use one of: " + Arrays.toString(Unit.values()));
                }
            } else {
                System.out.println("You have no recipes to add an ingredient to!");
            }
        }

        
        else if (command.getWord2().equals("recipe")) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("What's the name of the recipe? ");
            String name = scanner.nextLine();
            
            System.out.println("What's the serving size?");
            int serving =  Integer.parseInt(scanner.nextLine());
            
            System.out.println("What type of recipe is it (Appetizer, mainDish or dessert?) ");
            String typeInput = scanner.nextLine().toUpperCase();
            
            System.out.println("what's the Flavor/Sweetness/spicy level (0/10)?");
            int level = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Is this recipe vegetarian? (yes/no): ");
            String input = scanner.nextLine().trim().toLowerCase();
            boolean vege = input.equals("yes");
            try {
                TableOfContents type = TableOfContents.valueOf(typeInput);
                Recipe newRecipe;

                switch (type) {
                    case MAINDISH:
                        newRecipe = new MainDish(name, serving, level, vege);
                        break;
                    case DESSERT:
                        newRecipe = new Dessert(name, serving, level, vege);
                        break;
                    case APPETIZER:
                        newRecipe = new Appetizer(name, serving, level, vege);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown type");
                }
                addRecipes(newRecipe);
                
            }catch (IllegalArgumentException e) {
                System.out.println("Invalid type. Valid options: " + Arrays.toString(TableOfContents.values()));
            }
            
            
        }
        else if (command.getWord2().equals("step")) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Which recipe do you want to add a step to? ");
            String recipeName = scanner.nextLine();

            Recipe target = null;
            for (Recipe recipe : recipes) {
                if (recipe.getName().equalsIgnoreCase(recipeName)) {
                    target = recipe;
                    break;
                }
            }

            if (target == null) {
                System.out.println("Recipe not found.");
                return;
            }

            System.out.print("Enter step number: ");
            int order = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter step instruction: ");
            String instruction = scanner.nextLine();

            Step newStep = new Step(order, instruction);
            target.addStep(newStep);

            System.out.println("Added: " + newStep + " to " + target.getName());
        }
        else if (command.getWord2().equals("scale")) {
            if (recipes.size() > 0) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("In which recipe is the ingredient? ");
                String recipeName = scanner.nextLine();
                Recipe target = searchRecipeName(recipeName);

                if (target == null) {
                    System.out.println("Recipe not found.");
                        return;
                }

                target.listIngredients();

                System.out.print("Which ingredient do you want to scale? ");
                String ingredientName = scanner.nextLine();
    
                Ingredient ingredient = target.searchIngredient(ingredientName);
                if (ingredient == null) {
                    System.out.println("Ingredient not found.");
                    return;
                }
    
                System.out.print("Scale by what factor (integer)? ");
                int factor = Integer.parseInt(scanner.nextLine());

                ingredient.scaleIngredients(factor);
                System.out.println("Scaled: " + ingredient);
            } else {
                System.out.println("There are no recipes!");
            }
        }
        
        
    }
    
    public void remove(Command command) {
        if(command.getWord2() == null)
        {
            System.out.println("remove what?");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        if (command.getWord2().equals("recipe")) {
            if(recipes.size() > 0)
            {
                System.out.print("Enter recipe name to remove: ");
                String recipeName = scanner.nextLine();
                removeRecipes(recipeName);
                System.out.println("Recipe removed: " + recipeName);
            }
            else
            {
                System.out.println("Invalid recipe");
            }
            
        }

        if (command.getWord2().equals("ingredient")) {
            System.out.print("Enter recipe name: ");
            String recipeName = scanner.nextLine();
            Recipe target = searchRecipeName(recipeName);

            if (target != null) {
                System.out.print("Enter ingredient name to remove: ");
                String ingredientName = scanner.nextLine();
                target.removeIngredient(ingredientName);
                System.out.println("Ingredient removed: " + ingredientName);
            } else {
                System.out.println("Recipe not found.");
            }
        }

        if (command.getWord2().equals("step")) {
            System.out.print("Enter recipe name: ");
            String recipeName = scanner.nextLine();
            Recipe target = searchRecipeName(recipeName);
    
            if (target != null) {
                System.out.print("Enter step number to remove: ");
                String instruction = scanner.nextLine();
                target.removeStep2(instruction);
                System.out.println("Step removed: " + instruction);
            } else {
                System.out.println("Recipe not found.");
            }
        }
    }
    
    //SHOW AND HELP:
    
    public void help()
    {
        System.out.println("LIST OF COMMANDS:");
        System.out.println("add/remove: recipe, step, ingredient, [add] scale");
        System.out.println("show: recipes, types, units, ingredients, steps, best, appetizers, mainDishes, desserts");
        System.out.println("vote: up, down");
        System.out.println("close");
        System.out.println("help");
    }
    
    public void show(Command command)
    {
        if(command.getWord2() == null)
        {
            System.out.println("show what?");
            return;
        }
        
        
        
        if (command.getWord2().equals("recipes")) 
        {
            if(recipes.size() > 0)
            {
                printAllRecipes();
            }
            else
            {
                System.out.println("no recipes found");
            }
            
        }
        
        if (command.getWord2().equals("appetizers")) 
        {
            if(listApps().size() < 0)
            {
                System.out.println("No appetizers found.");
            }
            else
            {
                for(int i = 0; i < listApps().size(); i++)
                {
                    listApps().get(i).showProperties();
                }
            }
        }
        if (command.getWord2().equals("mainDishes")) 
        {
            if(listApps().size() < 0)
            {
                System.out.println("No main dishes found.");
            }
            else
            {
                for(int i = 0; i < listMainDish().size(); i++)
                {
                    listMainDish().get(i).showProperties();
                }
            }
        }
        if (command.getWord2().equals("desserts")) 
        {
            if(listApps().size() < 0)
            {
                System.out.print("No desserts found.");
            }
            else
            {
                for(int i = 0; i < listDessert().size(); i++)
                {
                    listDessert().get(i).showProperties();
                }
            }
        }
        
        if (command.getWord2().equals("types")) 
        {
            for(TableOfContents table : TableOfContents.values())
            {
                System.out.println(table);
            }
        }
        
        if (command.getWord2().equals("units")) 
        {
            for(Unit unit : Unit.values())
            {
                System.out.println(unit);
            }
        }
        
        if (command.getWord2().equals("ingredients")) 
        {
            if(recipes.size() > 0)
            {
                Scanner scanner = new Scanner(System.in);

                System.out.print("show ingredients of which recipe?");
                String recipeName = scanner.nextLine();
                Recipe target = searchRecipeName(recipeName);
            
                target.listIngredients();
            }
            else
            {
                System.out.print("you have no recipes!");
            }
            
        }
        
        if (command.getWord2().equals("steps")) 
        {
            if(recipes.size() > 0)
            {
                Scanner scanner = new Scanner(System.in);

                System.out.print("show steps of which recipe? ");
                String recipeName = scanner.nextLine();
                
                Recipe target = null;
                for (Recipe recipe : recipes) {
                    if (recipe.getName().equalsIgnoreCase(recipeName)) {
                        target = recipe;
                        break;
                    }
                }

                
                if (target == null) {
                    System.out.println("Recipe not found.");
                    return;
                }
                
                
                target.listSteps();
            }
            else
            {
                System.out.print("you have no recipes!");
            }
            
        }
        
        if (command.getWord2().equals("best")) 
        {
            getHighestVoted();
        }
    }
    
    //VOTING SYSTEM:
    
    public void Vote(Command command)
    {
        if(command.getWord2() == null)
        {
            System.out.println("vote what?");
            return;
        }
        
        
        
        if(recipes.size() > 0 )
        {
            Scanner scanner = new Scanner(System.in);
            
            if (command.getWord2().equals("up")) 
            {
                System.out.print("upVote which recipe?");
                String recipeName = scanner.nextLine();
            
                Recipe target = searchRecipeName(recipeName);
                
                target.increaseVote();
                System.out.println("UpVoted " + target.getName());
            }
        
            if(command.getWord2().equals("down"))
            {
                System.out.print("downVote which recipe?");
                String recipeName = scanner.nextLine();
            
                Recipe target = searchRecipeName(recipeName);
            
                target.decreaseVote();
                System.out.println("DownVoted " + target.getName());
            }
        }
        else
        {
            System.out.println("you have no recipes!");
        }
        
        
    }
    
}