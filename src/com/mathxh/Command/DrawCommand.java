package com.mathxh.Command;

import java.awt.*;

public class DrawCommand implements Command {
    private Point position;
    protected Drawable drawable;
    public DrawCommand(Drawable drawable, Point position) {
        this.position = position;
        this.drawable = drawable;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
