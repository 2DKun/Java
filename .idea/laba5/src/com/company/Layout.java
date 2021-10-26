package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Layout extends JFrame {
    Image img;
    Layout(Image img) {
        this.img=img;

    }
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }

}
