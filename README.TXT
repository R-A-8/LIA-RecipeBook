------------------------------------------------------------------------
Ceci est le fichier LISEZMOI (README) du projet.  Décrivez-y votre projet.
Dites au lecteur (qui ne sait rien du projet) ce qu'il a besoin de savoir.
Au minimum, remplissez cette description :
------------------------------------------------------------------------

TITRE DU PROJET :
BUT POURSUIVI :
VERSION ou DATE :
COMMENT INVOQUER CE PROJET :
AUTEURS :
INSTRUCTIONS Ŕ L'USAGER :


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


    
