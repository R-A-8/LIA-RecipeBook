

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
        RecipeBook recipeBo2 = new RecipeBook("Joe", "Joe's Recipes", 50, 3);
        Recipes recipes1 = new Recipes();
        recipeBo2.addRecipes(recipes1);
    }


    @Test
    public void recipeCountTest()
    {
        RecipeBook recipeBo2 = new RecipeBook("Tony", "Tony's dishes", 45, 9);
        Desserts desserts2 = new Desserts(7);
        Appatiser appatise2 = new Appatiser();
        MainDish mainDish2 = new MainDish();
        recipeBo2.addRecipes(desserts2);
        recipeBo2.addRecipes(appatise2);
        recipeBo2.addRecipes(mainDish2);
        assertEquals(3, recipeBo2.getRecipeCount());
    }

    @Test
    public void searchRecipeNameTest()
    {
        RecipeBook recipeBo1 = new RecipeBook("John", "John's Recipes, INC.", 45, 9);
        Desserts desserts1 = new Desserts(6);
        Appatiser appatise1 = new Appatiser();
        MainDish mainDish1 = new MainDish();
        recipeBo1.addRecipes(desserts1);
        recipeBo1.addRecipes(appatise1);
        recipeBo1.addRecipes(mainDish1);
        recipeBo1.searchRecipeName(appatise1);
    }
}



