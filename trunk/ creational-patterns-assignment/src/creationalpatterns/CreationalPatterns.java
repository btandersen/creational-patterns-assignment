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
            Scanner lineScanner = new Scanner(new FileInputStream(filename));
            
            while (lineScanner.hasNext())
            {
                String line = lineScanner.nextLine();
                
                String elements[] = line.split(":");
                
                String title = elements[0].trim();
                String category = elements[1].trim();
                String ingredients[] = elements[2].trim().split(",");
                
                MenuItem item = menuItemFactory.createMenuItem(category);
                
                item.setTitle(title);
                
                for (int i = 0; i < ingredients.length; i++)
                {
                    item.addIngredient(ingredients[i].trim());
                }
                
                menu.addMenuItem(item);
            }
        }
        catch (FileNotFoundException e)
        {
            System.err.println(e.getMessage());
        }
        
        System.out.println(menu);
    }
}
