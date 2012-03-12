/*
 * Brandon T. Andersen
 * 1000878186
 * Online Graduate Student
 * CSE 460/598 Spring 2012
 * 
 * Creational Patterns Assignment
 */
package creationalpatterns;

/**
 *
 * @author Brandon
 */
public class Sandwich extends MenuItem
{

    public Sandwich(IngredientFactory ingredientFactory)
    {
        this.category = "Sandwich";
        this.ingredientFactory = ingredientFactory;
    }
}
