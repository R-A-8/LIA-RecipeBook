

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test RecipeBookTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class RecipeBookTest
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    

    /**
     * Constructeur de la classe-test RecipeBookTest
     */
    public RecipeBookTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    

    @Test
    public void addRecipeTest()
    {
        RecipeBook recipeBo1 = new RecipeBook("Joe", "Joe's Recipes", 55, 5);
        Dessert dessert1 = new Dessert("Tiramisu", 4, 6, false);
        recipeBo1.addRecipes(dessert1);
    }

    @Test
    public void removeRecipeTest()
    {
        RecipeBook recipeBo1 = new RecipeBook("Joe", "Joe's Recipes", 55, 5);
        Dessert dessert1 = new Dessert("Tiramisu", 4, 6, false);
        recipeBo1.addRecipes(dessert1);
        recipeBo1.removeRecipes("Tiramisu");
    }

    @Test
    public void getRecipeCountTest()
    {
        RecipeBook recipeBo1 = new RecipeBook("Joe", "Joe's Recipes", 55, 5);
        Dessert dessert1 = new Dessert("Tiramisu", 4, 6, false);
        Appetizer appetize1 = new Appetizer("Caesar Salad", 1, 6, true);
        recipeBo1.addRecipes(dessert1);
        recipeBo1.addRecipes(appetize1);
        assertEquals(2, recipeBo1.getRecipeCount());
    }

    @Test
    public void searchRecipeNameTest()
    {
        RecipeBook recipeBo1 = new RecipeBook("Joe", "Joe's Recipes", 55, 5);
        Dessert dessert1 = new Dessert("Sundae", 1, 10, false);
        recipeBo1.addRecipes(dessert1);
        assertEquals("Sundae", recipeBo1.searchRecipeName("Sundae"));
    }

    @Test
    public void addVoteTest()
    {
        RecipeBook recipeBo1 = new RecipeBook("Joe", "Joe's Recipes", 55, 5);
        MainDish mainDish1 = new MainDish("Sushi", 4, 2, false);
        recipeBo1.addRecipes(mainDish1);
        recipeBo1.addVote(mainDish1);
    }
    
    @Test
    public void removeVoteTest()
    {
        RecipeBook recipeBo1 = new RecipeBook("Joe", "Joe's Recipes", 55, 5);
        MainDish mainDish1 = new MainDish("Sushi", 4, 2, false);
        recipeBo1.addRecipes(mainDish1);
        recipeBo1.addVote(mainDish1);
        recipeBo1.removeVote(mainDish1);
    }
    
    // @Test
    //public void getHighestVotedTest()
    //{
        //RecipeBook recipeBo1 = new RecipeBook("Joe", "Joe's Recipes", 55, 5);
        //MainDish mainDish1 = new MainDish("Sushi", 4, 2, false);
        //Dessert dessert1 = new Dessert("Cupcake", 6, 6, true);
        //recipeBo1.addRecipes(mainDish1);
        //recipeBo1.addRecipes(dessert1);
        //recipeBo1.addVote(mainDish1);
        //recipeBo1.addVote(mainDish1);
        //recipeBo1.addVote(mainDish1);
        //recipeBo1.addVote(dessert1);
        
    //}

    @Test
    public void getHighestVotedTest()
    {
        RecipeBook recipeBo1 = new RecipeBook("Joe", "Joe's Recipes", 55, 5);
        Dessert dessert1 = new Dessert("Cupcake", 6, 6, true);
        MainDish mainDish1 = new MainDish("Sushi", 10, 2, false);
        recipeBo1.addRecipes(mainDish1);
        recipeBo1.addRecipes(dessert1);
        recipeBo1.addVote(mainDish1);
        recipeBo1.addVote(mainDish1);
        recipeBo1.addVote(mainDish1);
        recipeBo1.addVote(dessert1);
        recipeBo1.getHighestVoted();
    }
}









