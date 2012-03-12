/*
 * Brandon T. Andersen
 * 1000878186
 * Online Graduate Student
 * CSE 460/598 Spring 2012
 * 
 * Creational Patterns Assignment
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
        String filename = "menu.txt"; // name of the menu input file
        Menu menu = Menu.getInstance(); // get the instance of the Menu class (a Singleton)
        MenuItemFactory menuItemFactory = MenuItemFactory.getInstance(); // get the instance of the MenuItemFactory class (a Singleton)
        
        // try-catch block for file IO exceptions
        try
        {
            // open up the input file and read it with a scanner
            Scanner lineScanner = new Scanner(new FileInputStream(filename));
            
            // step through the file, line by line
            while (lineScanner.hasNext())
            {
                // get the current line
                String line = lineScanner.nextLine();
                
                // split the elements
                String elements[] = line.split(":");
                
                // first is title, second is category, third is ingredient list
                String title = elements[0].trim();
                String category = elements[1].trim();
                String ingredients[] = elements[2].trim().split(",");
                
                // create a new menu item depending on the category
                MenuItem item = menuItemFactory.createMenuItem(category);
                
                // set the item's title
                item.setTitle(title);
                
                // add the ingredients
                for (int i = 0; i < ingredients.length; i++)
                {
                    item.addIngredient(ingredients[i].trim());
                }
                
                // add the item to the menu
                menu.addMenuItem(item);
            }
        }
        catch (FileNotFoundException e)
        {
            System.err.println(e.getMessage());
        }
        
        // print the menu to the standard output
        System.out.println(menu);
    }
}
