/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantcalculator;

import javax.swing.*;
import java.awt.GridLayout;

/**
 *
 * @author jordan
 */
public class ToppingsPanel extends JPanel
{
    private final JCheckBox creamCheese, butter, blueBerry, strawBerry, fruitSpread,
            peachJelly, jam, almonds;
    private final double addToppingCost = 0.50;
    private int toppingCount;
    double subtotal = 0.0;
    
    
    public ToppingsPanel()
    {        
        creamCheese = new JCheckBox("Cream Cheese");
        butter = new JCheckBox("Butter");
        blueBerry = new JCheckBox("Blueberry Spread");
        strawBerry = new JCheckBox("Strawberry Spread");
        peachJelly = new JCheckBox("Peach");
        fruitSpread = new JCheckBox("Mixed Fruit Spread");
        jam = new JCheckBox("Jam");
        almonds = new JCheckBox("Chopped Almonds");
        
        setLayout(new GridLayout(8,1));
        setBorder(BorderFactory.createTitledBorder("Spreads/Toppings"));
        
        add(creamCheese);
        add(butter);
        add(blueBerry);
        add(strawBerry);
        add(peachJelly);
        add(fruitSpread);
        add(jam);
        add(almonds);
    }
    
    public double selectToppings()
    {
        toppingCount = 0;
        
        if(creamCheese.isSelected())
        {
            subtotal += addToppingCost;
            toppingCount++;
            
        }
        
        if(butter.isSelected())
        {
            subtotal += addToppingCost;
            toppingCount++;
        }
        
        if(blueBerry.isSelected())
        {
            subtotal += addToppingCost;
            toppingCount++;
        }
        
        if(strawBerry.isSelected())
        {
            subtotal += addToppingCost;
            toppingCount++;
        }
        
        if(peachJelly.isSelected())
        {
            subtotal += addToppingCost;
            toppingCount++;
        }
        
        if(fruitSpread.isSelected())
        {
            subtotal += addToppingCost;
            toppingCount++;
        }
        
        if(jam.isSelected())
        {
            subtotal += addToppingCost;
            toppingCount++;
        }
        
        if(almonds.isSelected())
        {
            subtotal += addToppingCost;
            toppingCount++;
        }
        
        if(toppingCount > 1)
        {
            subtotal = subtotal - 0.50;
        }
        
        return subtotal;
    }
    
    public void resetSubtotal()
    {
        subtotal = 0.0;
    }
}
