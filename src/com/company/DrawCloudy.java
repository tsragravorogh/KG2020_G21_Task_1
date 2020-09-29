package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawCloudy implements Drawable {
    private int width;
    private int height;

    public DrawCloudy(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D gr, int width, int height) {
        int coefficient, plus;
        for(int i = 150; i < width + 50; i += 300 + Utils.getRandom(100)) {
            coefficient = 0; plus = 40;
            for(int j = (height / 3) + 45; j > 0; j -= 60 + plus + Utils.getRandom(100)) {
                coefficient++;
                drawAll(gr, i, j, coefficient);
            }
        }

        for(int i = 0; i < width + 50; i += 300 + Utils.getRandom(100)) {
            coefficient = 0; plus = 40;
            for(int j = height / 3 + 45; j > 0; j -= 60 + plus + Utils.getRandom(100)) {
                coefficient++;
                drawAll(gr, i, j, coefficient);
            }
        }
    }

    public static void drawAll(Graphics gr, int x, int y, int coefficient) {
        Color newColor = new Color(68, 79, 88);
        gr.setColor(newColor);
        if(coefficient > 1) {
            gr.fillOval(x - (coefficient * 5), y, 20 * coefficient, 20 * coefficient);
            gr.fillOval(x + 25 - (coefficient * 5), y, 20 * coefficient, 20 * coefficient);
            gr.fillOval(x - 25 - (coefficient * 5), y, 20 * coefficient, 20 * coefficient);
            gr.fillOval(x - (coefficient * 5), y - 18, 20 * coefficient, 20 * coefficient);
            if(coefficient == 2) {
                for (int i = x - 38; i < x + 38; i += 9) {
                    drawDrop(gr, i + 10, y + 35);
                }
            }
        }else {
            gr.fillOval(x, y, 20, 20);
            gr.fillOval(x + 25, y, 20, 20);
            gr.fillOval(x - 25, y, 20, 20);
            gr.fillOval(x, y - 18, 20, 20);
        }
    }

    public static void drawDrop(Graphics gr, int x, int y) {
        Color newColor = new Color(115, 184, 240);
        gr.setColor(newColor);
        Graphics2D g2 = (Graphics2D) gr;
        g2.setStroke(new BasicStroke(2.0f));
        g2.drawLine(x, y, x + 9, y + 8);
    }


}

