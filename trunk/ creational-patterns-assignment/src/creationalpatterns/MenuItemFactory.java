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
        switch (type)
        {
            case "Pie":
                return new Pie(IngredientFactory.getInstance());
            case "Salad":
                return new Salad(IngredientFactory.getInstance());
            case "Sandwich":
                return new Sandwich(IngredientFactory.getInstance());
            default:
                return null;
        }
    }
}
