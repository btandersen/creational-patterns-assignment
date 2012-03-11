/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

    private Menu()
    {
        //
        menuItems = new ArrayList<>();
    }

    public static synchronized Menu getInstance()
    {
        if (Menu.instance == null)
        {
            Menu.instance = new Menu();
        }

        return Menu.instance;
    }
    
    public void addMenuItem(MenuItem item)
    {
        this.menuItems.add(item);
    }
    
    @Override
    public String toString()
    {
        String str = "Menu:\n";
        
        for (int i = 0; i < this.menuItems.size(); i++)
        {
            str = str + this.menuItems.get(i) + "\n";
        }
        
        return str;
    }
}
