package GEOGRAPHY_QUIZ;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GeographyQuiz geographyQuiz = new GeographyQuiz();
        geographyQuiz.setContentPane(geographyQuiz.container);
        geographyQuiz.setVisible(true);
        geographyQuiz.setLocationRelativeTo(null);
        geographyQuiz.setSize(400,300);
        geographyQuiz.setResizable(false);
        geographyQuiz.setTitle("Number Counter");
        geographyQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
