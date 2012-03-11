/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;

/**
 *
 * @author Brandon
 */
public abstract class MenuItem
{
    //Data members

    protected String title;
    protected String category;
    protected Meat meats[];
    protected Vegetable vegetables[];
    protected BakedGood bakedGoods[];
    protected Topping toppings[];
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
}
