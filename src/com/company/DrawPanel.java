package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel{

    private ArrayList<Cloudy> clouds= new ArrayList<>();
    private ArrayList<OneFir> firs = new ArrayList<>();
    private ArrayList<OneTree> trees = new ArrayList<>();

    private OneFir fir;
    private OneTree tree;
    private Text text;

    public DrawPanel() {
        //System.out.println(width);
        //this.sky = new DrawSky(width, height);
        for(int i = 0; i < Utils.getRandom(10, 15); i++) {
            this.clouds.add(new Cloudy(Utils.getRandom(0, 1), Utils.getRandom(0, 1./3),  2));
        }
        for(int i = 0; i < Utils.getRandom(30, 45); i++) {
            this.firs.add(new OneFir(Utils.getRandom(0, 0.5), Utils.getRandom(1./3, 1)));
        }
        for(int i = 0; i < Utils.getRandom(40, 45); i++) {
            this.trees.add(new OneTree(Utils.getRandom(0.5, 0.8), Utils.getRandom(1./3, 1)));
        }

        this.clouds.add(new Cloudy(1./3, 1./12, 2));
        this.fir = new OneFir(1./5, 1./3);
        this.tree = new OneTree(2./3, 2./3);
        this.text = new Text(0.5, 0.8);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        Color newColor = new Color(107, 139, 168);
        gr.setColor(newColor);
        gr.fillRect(0, 0, getWidth(), getHeight() / 3);

        for(int i = 0; i < clouds.size(); i++) {
            clouds.get(i).draw(gr, getWidth(), getHeight());
        }

        newColor = new Color(33, 161, 31);
        gr.setColor(newColor);
        gr.fillRect(0, getHeight() / 3, getWidth(), getHeight());

        for(int i = 0; i < firs.size(); i++) {
            firs.get(i).draw(gr, getWidth(), getHeight());
        }

        for(int i = 0; i < trees.size(); i++) {
            trees.get(i).draw(gr, getWidth(), getHeight());
        }
        text.draw(gr, getWidth(), getHeight());
    }
}
