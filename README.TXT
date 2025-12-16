TITRE DU PROJET : Recipe book
BUT POURSUIVI : The goal is to make a recipe book that can be easily changed and used.
VERSION ou DATE : 2025-12-16
COMMENT INVOQUER CE PROJET :Directly call the main method in the RecipeBook class, or
create a new RecipeBook object then calling its "run" method.
AUTEURS : Mohammad, Rend
INSTRUCTIONS Ŕ L'USAGER: Once the program runs, you have many commands availible.

help: shows you the list of all the commands in the program.

add/remove recipe: allows you to create or delete recipes.
add/remove step: allows you to add or remove a step for the recipe of your choice.
add/remove ingredient: create or delete ingredients for a certain recipe.
add scale: for when the serving size is either too big or too small. 

show: Can display list of recipes, the availible units of mesurement, the best voted
recipe, list of ingredients or steps in a particular recipe, and more.

edit: modify general project information, including author, company, number of pages, and number of sections.

quit: closes the program.



what's the input, parameters, output and what it does for each method

RecipeBook pseudocode (Rend)

public void addRecipes(Recipes recipeToAdd)
    {
        The input is the recipeToAdd parameter. 
        It adds the parameter to the ArrayList<Recipes> recipes.
    }
    
    public void removeRecipe(Recipes recipeToRemove)
    {
        For each recipe of type recipe in the recipies ArrayList,
            if the name of the inputed recipe to remove is the same as the recipe we're looking for, 
            remove it from the ArrayList.
    } 
    
    public int getRecipeCount(){
        For each recipe of type recipe in the recipies ArrayList,
            increment the index by 1.
    }
    
    
    public void searchRecipeName(Recipes recipeName)
    {
        For each recipe of type recipe in the recipies ArrayList,
            if the name of the inputed recipe is the same as the recipe we're looking for,
            print the recipe.
    }
    

Desserts pseudocode(Rend)

public void giveSweetnessLevel(){
      If the sweetnessLevel(inputed in the constructor) is less than 5(and higher than 0), print "Almost bitter."
      If the sweetnessLevel is 5 instead print "Moderately sweet."
      If the sweetnessLevel is higher than 5(and less than 10) instead print "Very sweet!"
   }

Ingredients pseudocode(Rend)    
 public void addIngredients(String ingredient, String number)
    {
        input the ingredient name of type String and the amount of that ingredient(also of type String) and add them to the ingredients HashMap.
    }
    
    public void removeIngredients(String ingredient)
    {
        if(ingredient.equals(ingredients)){
            ingredients.remove(ingredients);
        }
    }


    
