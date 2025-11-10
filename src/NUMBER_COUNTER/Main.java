package NUMBER_COUNTER;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        NumberCounter numberCounter = new NumberCounter();
        numberCounter.setContentPane(numberCounter.contentPane);
        numberCounter.setVisible(true);
        numberCounter.setLocationRelativeTo(null);
        numberCounter.setSize(300,200);
        numberCounter.setResizable(false);
        numberCounter.setTitle("Number Counter");
        numberCounter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

