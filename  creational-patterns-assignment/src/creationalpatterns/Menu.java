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
public class Menu
{

    private static Menu instance = null;
    private ArrayList<MenuItem> menuItems;

    // contructor, private since this class is treated as a Singleton
    // cannot be called outside class
    private Menu()
    {
        // initialize the menu items list
        menuItems = new ArrayList<>();
    }

    // getInstance method either creates an instance if not already done
    // or returns the instance created previously
    public static synchronized Menu getInstance()
    {
        if (Menu.instance == null)
        {
            Menu.instance = new Menu();
        }

        return Menu.instance;
    }
    
    // add the supplied menu item to the list of items
    public void addMenuItem(MenuItem item)
    {
        this.menuItems.add(item);
    }
    
    @Override
    // string representation of the menu
    public String toString()
    {
        String str = "Menu:\n";
        
        str = str + "----------\n";
        
        for (int i = 0; i < this.menuItems.size(); i++)
        {
            str = str + this.menuItems.get(i) + "----------\n";
        }
        
        return str;
    }
}
