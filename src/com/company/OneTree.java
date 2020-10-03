package com.company;

import java.awt.*;

public class OneTree implements Drawable{
    private double kx;
    private double ky;

    public OneTree(double kx, double ky) {
        this.kx = kx;
        this.ky = ky;
    }

    @Override
    public void draw(Graphics2D gr, int width, int height) {
        int x = (int) (kx * width);
        int y = (int) (ky * height);

        Color newColor = new Color(65, 34, 14);
        gr.setColor(newColor);
        gr.fillRect(x, y, 10, 60);
        newColor = new Color(27, 110, 24);
        gr.setColor(newColor);
        gr.fillOval(x - 21, y - 5, 50, 40);
    }
}
