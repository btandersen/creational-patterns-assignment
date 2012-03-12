/*
 * Brandon T. Andersen
 * 1000878186
 * Online Graduate Student
 * CSE 460/598 Spring 2012
 * 
 * Creational Patterns Assignment
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
