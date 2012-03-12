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
import java.util.Arrays;

/**
 *
 * @author Brandon
 */
public class IngredientFactory
{
    //Data members

    private String meats[] =
    {
        "Steak", "Kidney", "Ground Beef", "Pork Pie", "Ham", "Danish Back Bacon"
    };
    private String vegetables[] =
    {
        "Onion", "Pickled Onion", "Carrots", "Peas", "Mashed Potatoes", "Mushroom", "Lettuce", "Branston Pickle", "Tomato", "Tomatoes"
    };
    private String bakedGood[] =
    {
        "Flakey Pastry", "Bread"
    };
    private String toppings[] =
    {
        "Gravy", "Cheese", "Cheddar Cheese", "Oil", "Vinegar", "English Mustard", "HP Sauce"
    };
    private ArrayList<String> meatTypes;
    private ArrayList<String> vegetableTypes;
    private ArrayList<String> bakedGoodTypes;
    private ArrayList<String> toppingTypes;
    private static IngredientFactory instance = null;

    private IngredientFactory()
    {
        this.meatTypes = new ArrayList<>(Arrays.asList(meats));
        this.vegetableTypes = new ArrayList<>(Arrays.asList(vegetables));
        this.bakedGoodTypes = new ArrayList<>(Arrays.asList(bakedGood));
        this.toppingTypes = new ArrayList<>(Arrays.asList(toppings));
    }

    public static synchronized IngredientFactory getInstance()
    {
        if (IngredientFactory.instance == null)
        {
            IngredientFactory.instance = new IngredientFactory();
        }

        return IngredientFactory.instance;
    }

    public boolean isMeat(String str)
    {
        return this.meatTypes.contains((String) str);
    }

    public boolean isVegetable(String str)
    {
        return this.vegetableTypes.contains((String) str);
    }

    public boolean isBakedGood(String str)
    {
        return this.bakedGoodTypes.contains((String) str);
    }

    public boolean isTopping(String str)
    {
        return this.toppingTypes.contains((String) str);
    }

    public Meat createMeat(String type)
    {
        if (type.equals("Steak"))
        {
            return new Steak();
        }
        else if (type.equals("Kidney"))
        {
            return new Kidney();
        }
        else if (type.equals("Ground Beef"))
        {
            return new GroundBeef();
        }
        else if (type.equals("Pork Pie"))
        {
            return new PorkPie();
        }
        else if (type.equals("Ham"))
        {
            return new Ham();
        }
        else if (type.equals("Danish Back Bacon"))
        {
            return new DanishBackBacon();
        }
        else
        {
            return null;
        }
    }

    public Vegetable createVegetable(String type)
    {
        if (type.equals("Onion"))
        {
            return new Onion();
        }
        else if (type.equals("Pickled Onion"))
        {
            return new PickledOnion();
        }
        else if (type.equals("Carrots"))
        {
            return new Carrots();
        }
        else if (type.equals("Peas"))
        {
            return new Peas();
        }
        else if (type.equals("Mashed Potatoes"))
        {
            return new MashedPotatoes();
        }
        else if (type.equals("Mushroom"))
        {
            return new Mushroom();
        }
        else if (type.equals("Lettuce"))
        {
            return new Lettuce();
        }
        else if (type.equals("Branston Pickle"))
        {
            return new BranstonPickle();
        }
        else if (type.equals("Tomato") || type.equals("Tomatoes"))
        {
            return new Tomato();
        }
        else
        {
            return null;
        }
    }

    public BakedGood createBakedGood(String type)
    {
        if (type.equals("Flakey Pastry"))
        {
            return new FlakeyPastry();
        }
        else if (type.equals("Bread"))
        {
            return new Bread();
        }
        else
        {
            return null;
        }
    }

    public Topping createTopping(String type)
    {
        if (type.equals("Gravy"))
        {
            return new Gravy();
        }
        else if (type.equals("Cheese"))
        {
            return new Cheese();
        }
        else if (type.equals("Cheddar Cheese"))
        {
            return new CheddarCheese();
        }
        else if (type.equals("Oil"))
        {
            return new Oil();
        }
        else if (type.equals("Vinegar"))
        {
            return new Vinegar();
        }
        else if (type.equals("English Mustard"))
        {
            return new EnglishMustard();
        }
        else if (type.equals("HP Sauce"))
        {
            return new HPSauce();
        }
        else
        {
            return null;
        }
    }
}
