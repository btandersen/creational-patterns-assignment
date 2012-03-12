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

    // contructor, private since this class is treated as a Singleton
    // cannot be called outside class
    private MenuItemFactory()
    {
        // nothing to initialize
    }

    // getInstance method either creates an instance if not already done
    // or returns the instance created previously
    public static synchronized MenuItemFactory getInstance()
    {
        if (MenuItemFactory.instance == null)
        {
            MenuItemFactory.instance = new MenuItemFactory();
        }

        return MenuItemFactory.instance;
    }

    // factory method to create a MenuItem, returns a concrete type depending on the
    // type requested
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
