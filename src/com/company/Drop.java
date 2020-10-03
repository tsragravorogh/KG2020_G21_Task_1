package com.company;

import java.awt.*;

public class Drop implements Drawable{
    private int x;
    private int y;


    public Drop(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D gr, int width, int height) {
        Color newColor = new Color(115, 184, 240);
        gr.setColor(newColor);
        Graphics2D g2 = (Graphics2D) gr;
        g2.setStroke(new BasicStroke(2.0f));
        g2.drawLine(x, y, x + 9, y + 8);
    }
}
