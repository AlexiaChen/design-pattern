package com.mathxh.Command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color = Color.red;
    private int radius = 6;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    public void paint(Graphics graph) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics graph = getGraphics();
        graph.setColor(color);
        graph.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
