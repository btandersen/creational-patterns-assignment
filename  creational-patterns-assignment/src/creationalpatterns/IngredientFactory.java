/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;

/**
 *
 * @author Brandon
 */
public class IngredientFactory
{

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
