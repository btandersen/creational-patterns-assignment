/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
