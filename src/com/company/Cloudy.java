package com.company;

import java.awt.*;

public class Cloudy implements Drawable{
    private double kx;
    private double ky;
    private int coefficient;


    public Cloudy(double kx, double ky, int coefficient) {
        this.kx = kx;
        this.ky = ky;
        this.coefficient = coefficient;
    }


    @Override
    public void draw(Graphics2D gr, int width, int height) {
        int x = (int)(width * kx);
        int y = (int)(height * ky);
        Color newColor = new Color(68, 79, 88);
        gr.setColor(newColor);
        if(coefficient > 1) {
            gr.fillOval(x - (coefficient * 5), y, 20 * coefficient, 20 * coefficient);
            gr.fillOval(x + 25 - (coefficient * 5), y, 20 * coefficient, 20 * coefficient);
            gr.fillOval(x - 25 - (coefficient * 5), y, 20 * coefficient, 20 * coefficient);
            gr.fillOval(x - (coefficient * 5), y - 18, 20 * coefficient, 20 * coefficient);
            if(coefficient == 2) {
                for (int i = x - 38; i < x + 38; i += 9) {
                    new Drop(i + 10, y + 35);
                }
            }
        }else {
            gr.fillOval(x, y, 20, 20);
            gr.fillOval(x + 25, y, 20, 20);
            gr.fillOval(x - 25, y, 20, 20);
            gr.fillOval(x, y - 18, 20, 20);
        }
    }
}
