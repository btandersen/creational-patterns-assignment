/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;

/**
 *
 * @author Brandon
 */
public class MenuItemFactory
{

    public MenuItem createMenuItem(String type)
    {
        switch (type)
        {
            case "Pie":
                return new Pie(new IngredientFactory());
            case "Salad":
                return new Salad(new IngredientFactory());
            case "Sandwich":
                return new Sandwich(new IngredientFactory());
            default:
                return null;
        }
    }
}
