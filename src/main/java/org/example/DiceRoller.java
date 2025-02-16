package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DiceRoller extends JFrame implements ActionListener {
    private JLabel label;
    private JButton rollButton;
    private Random random;

//    public DiceRoller() {
//        setTitle("Dice Roller");
//        setSize(300, 200);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new FlowLayout());
//
//        label = new JLabel("Roll the dice!");
//        label.setFont(new Font("Arial", Font.BOLD, 24));
//        add(label);
//
//        rollButton = new JButton("Roll Dice");
//        rollButton.setFont(new Font("Arial", Font.BOLD, 18));
//        rollButton.addActionListener(this);
//        add(rollButton);
//
//        random = new Random();
//        setVisible(true);
//        setLocationRelativeTo(null);
//    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        int roll = random.nextInt(6) + 1;
//        label.setText("You rolled: " + roll);
//    }

//    public static void main(String[] args) {
//        new DiceRoller();
//    }

}