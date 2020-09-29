package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel{
    private DrawSky sky;
    private DrawCloudy cloudy;
    private DrawGround ground;
    private DrawForest forest;
    private DrawText text;
    private int width = 1080;
    private int height = 800;

    public DrawPanel() {
        System.out.println(width);
        this.sky = new DrawSky(width, height);
        this.cloudy = new DrawCloudy(width, height);
        this.ground = new DrawGround(width, height);
        this.forest = new DrawForest(width, height);
        this.text = new DrawText(width, height);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        sky.draw(gr, getWidth(), getHeight());
        cloudy.draw(gr, getWidth(), getHeight());
        ground.draw(gr, getWidth(), getHeight());
        forest.draw(gr, getWidth(), getHeight());
        text.draw(gr, getWidth(), getHeight());
    }
}
