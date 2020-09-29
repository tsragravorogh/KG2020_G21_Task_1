package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawText implements Drawable{
    private int width;
    private int height;

    public DrawText(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setColor(Color.black);
        int temp = Utils.getRandom(29);
        String str = String.valueOf(temp);
        gr.setFont(new Font("Arial", Font.ITALIC, 20));
        gr.drawString("Rain", 100, 100);
        gr.drawString("+" + str, 100, 125);
    }
}

