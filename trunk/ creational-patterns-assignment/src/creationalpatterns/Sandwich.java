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
    // Data members

    private IngredientFactory ingredientFactory;

    public Sandwich()
    {
        this.category = "Sandwich";
    }
}
