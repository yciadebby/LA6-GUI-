package PIZZA_ORDER_SYSTEM;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaOrderSystemEditor extends JFrame {
    public JPanel contentPane;
    private JComboBox<String> pizzaSizeChoice;
    private JComboBox<String> pizzaToppingsChoice;
    private JComboBox<String> extraCheeseChoice;
    private JButton calculateButton;
    private JTextArea totalLabel;

    public PizzaOrderSystemEditor() {

        pizzaSizeChoice.setName("pizzaSizeChoice");
        pizzaToppingsChoice.setName("pizzaToppingChoice");
        extraCheeseChoice.setName("extraCheeseChoice");
        totalLabel.setName("totalLabel");
        calculateButton.setName("calculateButton");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = calculateTotal();
                totalLabel.setText(String.valueOf(total));
            }
        });
    }

    public int calculateTotal(){
        int total = 0;

        String size = pizzaSizeChoice.getSelectedItem().toString();
        if (!(size.equalsIgnoreCase("small"))) {
            if (size.equalsIgnoreCase("medium")) {
                total += 15;
            }
             else if (size.equalsIgnoreCase("large")){
                 total += 20;
            }
        } else {
            total += 10;
        }

        total += 2;

        String cheese = extraCheeseChoice.getSelectedItem().toString();
        if (cheese.equalsIgnoreCase("yes")){
            total += 3;
        }

        return total;
    }

}
