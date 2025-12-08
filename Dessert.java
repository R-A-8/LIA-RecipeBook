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
   

   /**
     * Constructor for objects of class Desserts
     */
    public Dessert(String name, String type)
    {
        super(name);
        
        this.sweetnessLevel = sweetnessLevel;
        
    }

   /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void listSugarBased()
    {
        //tbd
        
    }
    
   public void giveSweetnessLevel(){
      if(sweetnessLevel< 5){
          System.out.println("Almost bitter.");
      }
      else if(sweetnessLevel == 5){
          System.out.println("Moderately sweet.");
      }
      else if(sweetnessLevel > 5 && sweetnessLevel < 10){
          System.out.println("Very sweet!");
      }
   }
}