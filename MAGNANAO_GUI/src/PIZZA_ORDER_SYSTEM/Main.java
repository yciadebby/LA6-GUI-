package PIZZA_ORDER_SYSTEM;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        PizzaOrderSystemEditor pizzaOrderSystemEditor = new PizzaOrderSystemEditor();
        pizzaOrderSystemEditor.setContentPane(pizzaOrderSystemEditor.contentPane);
        pizzaOrderSystemEditor.setVisible(true);
        pizzaOrderSystemEditor.setLocationRelativeTo(null);
        pizzaOrderSystemEditor.setSize(300,400);
        pizzaOrderSystemEditor.setResizable(false);
        pizzaOrderSystemEditor.setTitle("Pizza Order System");
        pizzaOrderSystemEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
