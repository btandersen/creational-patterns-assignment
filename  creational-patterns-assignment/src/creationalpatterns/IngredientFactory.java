/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;

/**
 *
 * @author Brandon
 */
public interface IngredientFactory
{

    public Meat createMeat();

    public Vegetable createVegetable();

    public BakedGood createBakedGood();

    public Topping createTopping();
}
