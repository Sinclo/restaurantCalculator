/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantcalculator;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author jordan
 */
public class CoffeePanel extends JPanel
{
    private final ButtonGroup bg;
    private final JRadioButton none, black, mocha, cappuccino, latte, americano;
    private final double NONE = 0.00;
    private final double BLACK = 1.49;
    private final double MOCHA = 2.49;
    private final double CAPPUCCINO = 2.99;
    private final double LATTE = 2.99;
    private final double AMERICANO = 3.49;
    private double subtotal = 0.00;
    
    public CoffeePanel()
    {        
        setLayout(new GridLayout(6,1));
        setBorder(BorderFactory.createTitledBorder("Coffee"));
        
        none = new JRadioButton("None",true);
        black = new JRadioButton("Black $" + BLACK);
        mocha = new JRadioButton("Mocha $" + MOCHA);
        cappuccino = new JRadioButton("Cappuccino $" + CAPPUCCINO);
        latte = new JRadioButton("Latte $" + LATTE);
        americano = new JRadioButton("Americano $" + AMERICANO);
        
        bg = new ButtonGroup();
        bg.add(none);
        bg.add(black);
        bg.add(mocha);
        bg.add(cappuccino);
        bg.add(latte);
        bg.add(americano);
        
        add(none);
        add(black);
        add(mocha);
        add(cappuccino);
        add(latte);
        add(americano);
    }
    
    public double SelectCoffee()
    {
        if(none.isSelected())
        {
            subtotal += NONE;
        }
        
        if(black.isSelected())
        {
            subtotal += BLACK;
        }
        
        if(mocha.isSelected())
        {
            subtotal += MOCHA;
        }
        
        if(cappuccino.isSelected())
        {
            subtotal += CAPPUCCINO;
        }
        
        if(latte.isSelected())
        {
            subtotal += LATTE;
        }
        
        if(americano.isSelected())
        {
            subtotal += AMERICANO;
        }
        
        return subtotal;
    }
    
    public void resetSubtotal()
    {
        subtotal = 0.0;
    }
}
