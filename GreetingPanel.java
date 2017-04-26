/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantcalculator;

import javax.swing.*;

/**
 *
 * @author jordan
 */
public class GreetingPanel extends JPanel
{
    private final JLabel greetingLabel;
    
    public GreetingPanel()
    {
        greetingLabel = new JLabel("Welcome to Sinclo's Deli!");
        add(greetingLabel);
    }
}
