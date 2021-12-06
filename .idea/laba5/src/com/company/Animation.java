package com.company;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;


public class Animation extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    private Animation() {
        this.setSize(1200, 800);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.png")), SwingConstants.CENTER);


        getContentPane().add(imgLabel);

        Timer timer = new Timer(3000, e -> nextImg()); //время переключения
        timer.start();

    }

    private void nextImg() {
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum) + ".png")));
        if (imgNum == 4) imgNum = 0;

    }

    public static void main(String[] args) {
        Animation mf = new Animation();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);
        mf.setLocationRelativeTo(null);

    }
}
