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

    private static MenuItemFactory instance = null;

    private MenuItemFactory()
    {
        //
    }

    public static synchronized MenuItemFactory getInstance()
    {
        if (MenuItemFactory.instance == null)
        {
            MenuItemFactory.instance = new MenuItemFactory();
        }

        return MenuItemFactory.instance;
    }

    public MenuItem createMenuItem(String type)
    {
        if (type.equals("Pie"))
        {
            return new Pie(IngredientFactory.getInstance());
        }
        else if (type.equals("Salad"))
        {
            return new Salad(IngredientFactory.getInstance());
        }
        else if (type.equals("Sandwich"))
        {
            return new Sandwich(IngredientFactory.getInstance());
        }
        else
        {
            return null;
        }
    }
}
