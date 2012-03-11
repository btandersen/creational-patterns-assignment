/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Brandon
 */
public class CreationalPatterns
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String filename = "menu.txt";
        Menu menu = Menu.getInstance();
        MenuItemFactory menuItemFactory = MenuItemFactory.getInstance();
        
        try
        {
            Scanner sc = new Scanner(new FileInputStream(filename));
        }
        catch (FileNotFoundException e)
        {
            System.err.println(e.getMessage());
        }
        
        System.out.println(menu);
    }
}
