package com.company;

import java.awt.*;

public class OneFir implements Drawable{
    private double kx;
    private double ky;

    public OneFir(double kx, double ky) {
        this.kx = kx;
        this.ky = ky;
    }

    @Override
    public void draw(Graphics2D gr, int width, int height) {
        int x = (int)(width * kx);
        int y = (int)(height * ky);

        Color newColor = new Color(0xFF6C441B, true);
        gr.setColor(newColor);
        gr.fillRect(x - 3, y + 35, 10, 40);

        for (int i = 22; i > 7; i -= 7) {
            int[] xPoly = {x + i - (i - 3), x - (15 + i), x + (15 + i)};
            int[] yPoly = {y + i - 5, y + i * 2, y + i * 2};
            newColor = new Color(28, 78, 34, 255);
            gr.setColor(newColor);
            gr.fillPolygon(xPoly, yPoly, xPoly.length);
            newColor = new Color(15, 50, 20, 255);
            gr.setColor(newColor);
            gr.drawPolygon(xPoly, yPoly, xPoly.length);
        }
    }
}
