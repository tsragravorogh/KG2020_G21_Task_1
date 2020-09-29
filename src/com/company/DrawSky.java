package com.company;

import java.awt.*;

public class DrawSky implements Drawable{
    private int width;
    private int height;

    public DrawSky(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D gr, int width, int height) {
        Color newColor = new Color(107, 139, 168);
        gr.setColor(newColor);
        gr.fillRect(0, 0, width, height / 3);
    }

}

