/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;

/**
 *
 * @author Brandon
 */
public class Salad extends MenuItem
{

    public Salad(IngredientFactory ingredientFactory)
    {
        this.category = "Salad";
        this.ingredientFactory = ingredientFactory;
    }
}
