package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawGround implements Drawable{
    private int width;
    private int height;
    public DrawGround(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D gr, int width, int height) {
        Color newColor = new Color(33, 161, 31);
        gr.setColor(newColor);
        gr.fillRect(0, height / 3, width, height);
    }
}

