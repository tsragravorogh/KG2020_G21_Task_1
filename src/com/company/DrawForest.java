package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawForest implements Drawable{
    private int width;
    private int height;

    public DrawForest(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D gr, int width, int height) {
        for(int i = 25; i < width / 2 - 30; i += 40 + Utils.getRandom(100)) {
            for (int j = (height / 3) + 60; j < height - 50; j += 50 + Utils.getRandom(100)) {
                drawTree(gr, i, j);
            }
        }
        for(int i = width / 2; i < width - 30; i += 49 + Utils.getRandom(100)) {
            for(int j = height / 3; j < height - 10; j += 60 + Utils.getRandom(100)) {
                drawFir(gr, i, j);
            }
        }
    }

    public static void drawTree(Graphics gr, int x, int y) {
        Color newColor = new Color(65, 34, 14);
        gr.setColor(newColor);
        gr.fillRect(x, y, 10, 60);
        newColor = new Color(27, 110, 24);
        gr.setColor(newColor);
        gr.fillOval(x - 21, y - 5, 50, 40);
    }

    public static void drawFir(Graphics gr, int x, int y) {
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

