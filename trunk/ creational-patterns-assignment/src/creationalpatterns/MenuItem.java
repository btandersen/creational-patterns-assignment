/*
 * Brandon T. Andersen
 * 1000878186
 * Online Graduate Student
 * CSE 460/598 Spring 2012
 * 
 * Creational Patterns Assignment
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
    
    // constructor to initialize ingredient lists
    public MenuItem()
    {
        this.meats = new ArrayList<>();
        this.vegetables = new ArrayList<>();
        this.bakedGoods = new ArrayList<>();
        this.toppings = new ArrayList<>();
    }

    // get the title of the menu item
    public String getTitle()
    {
        return this.title;
    }

    // set the title of the menu item
    public void setTitle(String title)
    {
        this.title = title;
    }

    // add an ingredient based on the type passed
    public void addIngredient(String str)
    {
        // check for the type of ingredient and see if the factory has it
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
        // if not, let somebody know...
        else
        {
            System.out.println("The Ingredient Factory does not have any: " + str + "\n");
        }
    }

    @Override
    // string representation of a menu item, checks to see if the ingredient lists
    // have any ingredients in them builds a string to return
    public String toString()
    {
        String str = "";

        str = str + "Name: " + this.title + "\n";
        
        str = str + "Category: " + this.category + "\n";
        
        str = str + "Meats: ";

        if (!this.meats.isEmpty())
        {
            str = str + this.meats.toString().substring(1, this.meats.toString().length() - 1);
        }
        else
        {
            str = str + "None";
        }

        str = str + "\n";
        
        str = str + "Vegetables: ";

        if (!this.vegetables.isEmpty())
        {
            str = str + this.vegetables.toString().substring(1, this.vegetables.toString().length() - 1);
        }
        else
        {
            str = str + "None";
        }

        str = str + "\n";
        
        str = str + "Baked Goods: ";

        if (!this.bakedGoods.isEmpty())
        {
            str = str + this.bakedGoods.toString().substring(1, this.bakedGoods.toString().length() - 1);
        }
        else
        {
            str = str + "None";
        }

        str = str + "\n";
        
        str = str + "Toppings: ";

        if (!this.toppings.isEmpty())
        {
            str = str + this.toppings.toString().substring(1, this.toppings.toString().length() - 1);
        }
        else
        {
            str = str + "None";
        }

        str = str + "\n";

        return str;
    }
}
