package com.company;

import javax.swing.*;
import java.awt.*;

public class Text implements Drawable {
    private double kx;
    private double ky;

    public Text(double kx, double ky) {
        this.kx = kx;
        this.ky = ky;
    }

    @Override
    public void draw(Graphics2D gr, int width, int height) {
        int x = (int) (kx * width);
        int y = (int) (ky * height);
        gr.setColor(Color.black);

        Color newColor = new Color(0x583901);
        gr.setColor(newColor);
        gr.fillRect(x, y, 10, 50);

        int[] xPoly = {x - 20, x - 15, x + 25, x + 30, x + 25, x - 15};
        int[] yPoly = {y + 10, y + 20, y + 20, y + 10, y, y};

        gr.fillPolygon(xPoly, yPoly, xPoly.length);

        gr.setColor(new Color(0x000000));
        gr.setFont(new Font("Arial", Font.BOLD, 20));

        gr.drawString("ЛЕС", x - 17 , y + 17);
    }
}

