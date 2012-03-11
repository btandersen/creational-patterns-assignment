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
    // Data members

    private IngredientFactory ingredientFactory;

    public Salad()
    {
        this.category = "Salad";
    }
}
