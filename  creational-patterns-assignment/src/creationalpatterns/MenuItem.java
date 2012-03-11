/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;

import java.util.ArrayList;

/**
 *
 * @author Brandon
 */
public abstract class MenuItem
{
    //Data members

    protected String title;
    protected String category;
    protected ArrayList<Meat> meats;
    protected ArrayList<Vegetable> vegetables;
    protected ArrayList<BakedGood> bakedGoods;
    protected ArrayList<Topping> toppings;
    
    protected IngredientFactory ingredientFactory;
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void addIngredient(String str)
    {
        if (this.ingredientFactory.isMeat(str))
        {
            this.meats.add(this.ingredientFactory.createMeat(str));
        }
        else if (this.ingredientFactory.isVegetable(str))
        {
            this.vegetables.add(this.ingredientFactory.createVegetable(str));
        }
        else if (this.ingredientFactory.isBakedGood(str))
        {
            this.bakedGoods.add(this.ingredientFactory.createBakedGood(str));
        }
        else if (this.ingredientFactory.isTopping(str))
        {
            this.toppings.add(this.ingredientFactory.createTopping(str));
        }
        else
        {
            System.out.println("The Ingredient Factory does not have any: " + str + "\n");
        }
    }
    
    public String toString()
    {
        String str = "";
        
        
        
        return str;
    }
}
