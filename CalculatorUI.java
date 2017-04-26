/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantcalculator;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 *
 * @author jordan
 */
public class CalculatorUI extends JFrame
{
    private GreetingPanel greeting;
    private BagelPanel bagel; 
    private ToppingsPanel toppings; 
    private CoffeePanel coffee; 
    private JPanel calculatorPanel;
    private JButton calcButton, exitButton;
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 350;
    
    public void CalculatorWindow()
    {
        JFrame calculator = new JFrame();
        
        calculator.setTitle("Restaurant Calculator");
        
        calculator.setBounds(400, 250, WINDOW_WIDTH, WINDOW_HEIGHT);
        
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        calculator.setLayout(new BorderLayout());
                
        greeting = new GreetingPanel();
        bagel = new BagelPanel();
        toppings = new ToppingsPanel();
        coffee = new CoffeePanel();
        
        BuildPanel();
        
        greeting.setBackground(new Color(100, 100, 100));
        bagel.setBackground(new Color(255, 125, 0));
        toppings.setBackground(Color.orange);
        coffee.setBackground(new Color(255, 125, 0));
        calculatorPanel.setBackground(Color.darkGray);
                
        calculator.add(greeting, BorderLayout.NORTH);
        calculator.add(bagel, BorderLayout.WEST);
        calculator.add(toppings, BorderLayout.CENTER);
        calculator.add(coffee, BorderLayout.EAST);
        calculator.add(calculatorPanel, BorderLayout.SOUTH);
        
        calculator.pack();
        calculator.setVisible(true);
    }
    
    /** This portion creates and adds another panel, which consists of the
     * Calculate button and the Exit button.
     */
    private void BuildPanel()
    {        
        calculatorPanel = new JPanel();
        
        calcButton = new JButton("Calculate");
        exitButton = new JButton("Exit");
        
        calcButton.addActionListener(new calcButtonListener());
        exitButton.addActionListener(new exitButtonListener());
        
        calculatorPanel.add(calcButton);
        calculatorPanel.add(exitButton);
    }
    
    /** This operates the calculate button, and results in the calculator to
     * calculate the total cost of the items ordered in each transaction.
     */
    private class calcButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            e.setSource(calcButton);
            {
                calculatePrice();
            }
        }
    }
    
    // This operates the exit button, and results in exiting the program.
    private class exitButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    
    /** This method is called from calButtonListener, and calculates the
     * subtotal, tax, and grand total for a transaction.  The subtotal is then
     * reset for the next transaction.
     */ 
    private void calculatePrice()
    {
        DecimalFormat dollar = new DecimalFormat("$##0.00");
        double subtotal = bagel.selectBagel() + 
                        toppings.selectToppings() + coffee.SelectCoffee();
        double tax = subtotal * .0825;
        double grandTotal = subtotal + tax;
        
        displayPrice(subtotal, tax, grandTotal);
        JOptionPane.showMessageDialog(null, "Subtotal: " + dollar.format(subtotal) + "\n" + 
                "Tax: " + dollar.format(tax) + "\n" +
                "Grand Total: " + dollar.format(grandTotal));
        
        System.out.println("Subtotal: " + dollar.format(subtotal));
        System.out.println("Tax: " + dollar.format(tax));
        System.out.println("Grand Total: " + dollar.format(grandTotal));
        System.out.println("");
        
        //Resets subtotals from all 3 panels for next transaction.
        bagel.resetSubtotal();
        toppings.resetSubtotal();
        coffee.resetSubtotal();
    }
    
    private void displayPrice(double subtotal, double tax, double grandTotal)
    {
        JFrame displayPrice = new JFrame();
        
        displayPrice.setSize(400, 250);
        displayPrice.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        PricePanel(subtotal, tax, grandTotal);
        
        displayPrice.setVisible(true);
        
    }    
    
    private void PricePanel(double subtotal, double tax, double grandTotal)
    {
        JPanel PricePanel = new JPanel();
        DecimalFormat dollar = new DecimalFormat("$##0.00");
        JLabel price = new JLabel("Subtotal: " + dollar.format(subtotal) + "\n" + 
                "Tax: " + dollar.format(tax) + "\n" +
                "Grand Total: " + dollar.format(grandTotal));
        add(PricePanel);
        add(price);

    }
        
    
}
