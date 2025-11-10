package NUMBER_COUNTER;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberCounter extends JFrame {
    public JPanel contentPane;
    private JTextPane countLabel;
    private JButton decreaseButton;
    private JButton increaseButton;


    public NumberCounter() {

        countLabel.setName("countLabel");
        increaseButton.setName("increaseButton");
        decreaseButton.setName("decreaseButton");


        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(countLabel.getText());
                int num = increaseNumber(number);
                countLabel.setText(Integer.toString(num));
            }
        });
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(countLabel.getText());
                int num = decreaseNumber(number);
                countLabel.setText(Integer.toString(num));
            }
        });
    }

    public int increaseNumber(int num) {
        num+=1;
        return num;
    }
    public int decreaseNumber(int num) {
        if (num==0){
            return 0;
        }
        num-=1;
        return num;
    }


}

