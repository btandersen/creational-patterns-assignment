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
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
}
