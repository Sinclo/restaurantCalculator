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
public class BagelPanel extends JPanel
{
    private final ButtonGroup bg;
    private final JRadioButton none, whiteBagel, wheatBagel, raisinBagel, cinnamonBagel, 
            cranberryBagel, asiagoBagel;
    
    private double subtotal = 0.00;
    private final double NONE = 0.00;
    private final double WHITE = 2.49; 
    private final double WHEAT = 2.99; 
    private final double RAISIN = 3.49; 
    private final double CINNAMON = 3.99; 
    private final double CRANBERRY = 3.99; 
    private final double ASIAGO = 4.49;
    
    public BagelPanel()
    {        
        setLayout(new GridLayout(7,1));
        setBorder(BorderFactory.createTitledBorder("Bagels"));
        
        none = new JRadioButton("None", true);
        whiteBagel = new JRadioButton("White Bagel $" + WHITE);
        wheatBagel = new JRadioButton("Wheat Bagel $" + WHEAT);
        raisinBagel = new JRadioButton("Raisin Bagel $" + RAISIN);
        cinnamonBagel = new JRadioButton("Cinnamon Bagel $" + CINNAMON);
        cranberryBagel = new JRadioButton("Cranberry Bagel $" + CRANBERRY);
        asiagoBagel = new JRadioButton("Asiago Bagel $" + ASIAGO);
        
        bg = new ButtonGroup();
        
        bg.add(none);
        bg.add(whiteBagel);
        bg.add(wheatBagel);
        bg.add(raisinBagel);
        bg.add(cinnamonBagel);
        bg.add(cranberryBagel);
        bg.add(asiagoBagel);
        
        add(none);
        add(whiteBagel);
        add(wheatBagel);
        add(raisinBagel);
        add(cinnamonBagel);
        add(cranberryBagel);
        add(asiagoBagel);
    }
           
    public double selectBagel()
    {
        if(none.isSelected())
        {
            subtotal += NONE;
        }
        
        if(whiteBagel.isSelected())
        {
            subtotal += WHITE;
        }

        if(wheatBagel.isSelected())
        {
            subtotal += WHEAT;
        }

        if(raisinBagel.isSelected())
        {
            subtotal += RAISIN;
        }

        if(cinnamonBagel.isSelected())
        {
            subtotal += CINNAMON;
        }

        if(cranberryBagel.isSelected())
        {
            subtotal += CRANBERRY;
        }

        if(asiagoBagel.isSelected())
        {
            subtotal += ASIAGO;
        }
        
        return subtotal;
    }
    
    public void resetSubtotal()
    {
        subtotal = 0.0;
    }
}
