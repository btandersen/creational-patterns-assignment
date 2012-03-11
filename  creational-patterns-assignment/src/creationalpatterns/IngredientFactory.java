/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
    private String meats[] = {"Steak", "Kidney", "Ground Beef", "Pork Pie", "Ham", "Danish Back Bacon"};
    private String vegetables[] = {"Onion", "Pickled Onion", "Carrots", "Peas", "Mashed Potatoes", "Mushroom", "Lettuce", "Branston Pickle", "Tomato", "Tomatoes"};
    private String bakedGood[] = {"Flakey Pastry", "Bread"};
    private String toppings[] = {"Gravy", "Cheese", "Cheddar Cheese", "Oil", "Vinegar", "English Mustard", "HP Sauce"};
    private ArrayList<String> meatTypes;
    private ArrayList<String> vegetableTypes;
    private ArrayList<String> bakedGoodTypes;
    private ArrayList<String> toppingTypes;
    
    public IngredientFactory()
    {
        this.meatTypes = new ArrayList<>(Arrays.asList(meats));
        this.vegetableTypes = new ArrayList<>(Arrays.asList(vegetables));
        this.bakedGoodTypes = new ArrayList<>(Arrays.asList(bakedGood));
        this.toppingTypes = new ArrayList<>(Arrays.asList(toppings));
    }
    
    public boolean isMeat(String str)
    {
        return this.meatTypes.contains((String)str);
    }
    
    public boolean isVegetable(String str)
    {
        return this.vegetableTypes.contains((String)str);
    }
    
    public boolean isBakedGood(String str)
    {
        return this.bakedGoodTypes.contains((String)str);
    }
    
    public boolean isTopping(String str)
    {
        return this.toppingTypes.contains((String)str);
    }

    public Meat createMeat(String type)
    {
        switch (type)
        {
            case "Steak":
                return new Steak();
            case "Kidney":
                return new Kidney();
            case "Ground Beef":
                return new GroundBeef();
            case "Pork Pie":
                return new PorkPie();
            case "Ham":
                return new Ham();
            case "Danish Back Bacon":
                return new DanishBackBacon();
            default:
                return null;
        }
    }

    public Vegetable createVegetable(String type)
    {
        switch (type)
        {
            case "Onion":
                return new Onion();
            case "Pickled Onion":
                return new PickledOnion();
            case "Carrots":
                return new Carrots();
            case "Peas":
                return new Peas();
            case "Mashed Potatoes":
                return new MashedPotatoes();
            case "Mushroom":
                return new Mushroom();
            case "Lettuce":
                return new Lettuce();
            case "Branston Pickle":
                return new BranstonPickle();
            case "Tomato":
            case "Tomatoes":
                return new Tomato();
            default:
                return null;
        }
    }

    public BakedGood createBakedGood(String type)
    {
        switch (type)
        {
            case "Flakey Pastry":
                return new FlakeyPastry();
            case "Bread":
                return new Bread();
            default:
                return null;
        }
    }

    public Topping createTopping(String type)
    {
        switch (type)
        {
            case "Gravy":
                return new Gravy();
            case "Cheese":
                return new Cheese();
            case "Cheddar Cheese":
                return new CheddarCheese();
            case "Oil":
                return new Oil();
            case "Vinegar":
                return new Vinegar();
            case "English Mustard":
                return new EnglishMustard();
            case "HP Sauce":
                return new HPSauce();
            default:
                return null;
        }
    }
}
