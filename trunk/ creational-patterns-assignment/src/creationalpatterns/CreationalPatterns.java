/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;

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
        // TODO code application logic here
        System.out.println("Hello, world!!!");

        Menu menu1 = Menu.getInstance();

        Menu menu2 = Menu.getInstance();

        if (menu1 == menu2)
        {
            System.out.println("They are the same objects!!!");
        }
        else
        {
            System.out.println("WTF!!!");
        }
        
        System.out.println(menu1);
    }
}
