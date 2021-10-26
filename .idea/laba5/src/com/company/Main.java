package com.company;

import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{
    static Image img = new ImageIcon("res/500x500.png").getImage();

    static String path="res/500x500.png";

    public static void main(String[] MyArgs) throws IOException {

        //String path ="";


        for (int i = 0; i< MyArgs.length;i++) {
            path+=MyArgs[i];
        }

            System.out.println(path);


            System.out.println(path);
            //img = new ImageIcon("res/500x500.png").getImage();
            JFrame fr = new JFrame();
            fr.setLayout(null);
            fr.setSize(500, 500);
            fr.setVisible(true);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Main m = new Main();
            m.setBounds(0, 0, 500, 500);
            fr.add(m);
//java C:\Users\yasli\IdeaProjects\laba5\src\com\company\Main.java res/500x500.png

    }
    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(img, 0, 0, null);

    }



}
