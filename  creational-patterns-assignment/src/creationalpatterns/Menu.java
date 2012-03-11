/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;

/**
 *
 * @author Brandon
 */
public class Menu
{

    private static Menu instance = null;

    private Menu()
    {
        //
    }

    public static synchronized Menu getInstance()
    {
        if (Menu.instance == null)
        {
            Menu.instance = new Menu();
        }

        return Menu.instance;
    }
}
