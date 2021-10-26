package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

public class Bord {

    public static void Bord1() {

        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton northButton = new JButton("NORTH");
        panel.add(northButton, BorderLayout.NORTH);
        northButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Добро пожаловать в");
            }
        });
        JButton southButton = new JButton("SOUTH");
        panel.add(southButton, BorderLayout.SOUTH);
        southButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Добро пожаловать в Абха");
            }
        });

        JButton eastButton = new JButton("EAST");
        panel.add(eastButton, BorderLayout.EAST);
        eastButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Добро пожаловать в Дахране");
            }
        });

        JButton westButton = new JButton("WEST");
        panel.add(westButton, BorderLayout.WEST);
        westButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Добро пожаловать в Джидда");
            }
        });

        JButton centerButton = new JButton("CENTER");
        panel.add(centerButton, BorderLayout.CENTER);

        centerButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Добро пожаловать в ");
            }
        });
        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(550, 300));

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
