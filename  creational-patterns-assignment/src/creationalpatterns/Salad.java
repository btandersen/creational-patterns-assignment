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

    public Salad()
    {
        this.category = "Salad";
        this.ingredientFactory = new IngredientFactory();
    }
}
