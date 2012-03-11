/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;

/**
 *
 * @author Brandon
 */
public class Pie extends MenuItem
{

    public Pie(IngredientFactory ingredientFactory)
    {
        this.category = "Pie";
        this.ingredientFactory = ingredientFactory;
    }
}
