import java.util.ArrayList;

/**
 * Décrivez votre classe Desserts ici.
 *
 * @Rend A.
 * @version (un numéro de version ou une date)
 */
public class Dessert extends Recipe
{
   private int sweetnessLevel;
   private boolean isVegetarian;

   /**
     * Constructor for objects of class Desserts
     */
    public Dessert(String name, int serving, int sweetnessLevel, boolean isVegetarian)
    {
        super(name, serving);
        
        this.sweetnessLevel = sweetnessLevel;
        this.isVegetarian = isVegetarian;
        
    }
    
   public void giveSweetnessLevel(){
       if(sweetnessLevel < 0 && sweetnessLevel > 10)
       {
           System.out.println("invalid sweetness level.");
       }
       else if(sweetnessLevel< 5){
           System.out.println("Almost bitter.");
       }
       else if(sweetnessLevel == 5){
           System.out.println("Moderately sweet.");
       }
       else if(sweetnessLevel > 5 && sweetnessLevel <= 10){
           System.out.println("Very sweet!");
       }
   }
   
   public void showProperties() {
        System.out.println("Dessert: " + getName());
        System.out.println("Sweetness level: " + sweetnessLevel + "/10");
        giveSweetnessLevel();
        System.out.println("Vegetarian: " + (isVegetarian ? "Yes" : "No"));
    }
}