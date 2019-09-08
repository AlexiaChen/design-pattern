package com.mathxh.Interpreter;

import java.awt.*;

public class RobotCanvas extends Canvas implements ExecutorFactory {
    final static int STEP_LENGTH = 30;
    final static int DIRECTION_UP = 0;
    final static int DIRECTION_DOWN = 6;
    final static int DIRECTION_LEFT = 9;
    final static int DIRECTION_RIGHT = 3;

    final static int RELATIVE_DIRECTION_LEFT = -3;
    final static int RELATIVE_DIRECTION_RIGHT = 3;

    final static int RADIUS = 3;

    private int direction = 0;
    private Point position;
    private Executor executor;

    public RobotCanvas(int width, int height) {
        setSize(width, height);
        initialize();
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

    public void setRelativeDirection(int relativeDirection) {
        setDirection(direction + relativeDirection);
    }

    public void setDirection(int direction) {
        if(direction < 0) {
            direction = 12 - ((-direction) % 12);
        } else {
            direction = direction % 12;
        }
        this.direction = direction % 12;
    }

    public void go(int length) {
        int newX = position.x;
        int newY = position.y;

        switch (direction) {
            case DIRECTION_UP:
                newY -= length;
                break;
            case DIRECTION_DOWN:
                newY += length;
                break;
            case DIRECTION_LEFT:
                newX -= length;
                break;
            case DIRECTION_RIGHT:
                newX += length;
                break;
            default:
                break;
        }

        Graphics graphics = getGraphics();
        if(graphics != null) {
            graphics.drawLine(position.x, position.y, newX, newY);
            graphics.fillOval(newX - RADIUS, newY - RADIUS, RADIUS * 2 + 1, RADIUS * 2 + 1);
        }

        position.x = newX;
        position.y = newY;
    }

    public void initialize() {
        Dimension size = getSize();
        position = new Point(size.width / 2, size.height / 2);
        direction = 0;
        setForeground(Color.red);
        setBackground(Color.white);

        Graphics graphics = getGraphics();
        if(graphics != null) {
            graphics.clearRect(0, 0, size.width, size.height);
        }
    }

    @Override
    public Executor createExecutor(String name) {
        if(name.equals("go")) {
            return new GoExecutor(this);
        } else if(name.equals("right")) {
            return new DirectionExecutor(this, RELATIVE_DIRECTION_RIGHT);
        } else if(name.equals("left")) {
            return new DirectionExecutor(this, RELATIVE_DIRECTION_LEFT);
        } else {
            return null;
        }
    }

    public void paint(Graphics graphics) {
        initialize();
        if(executor !=  null) {
            try {
                executor.execute();
            } catch (ExecuteException ignored) {

            }
        }
    }


    abstract class RobotExecutor implements Executor {
        RobotCanvas canvas;
        RobotExecutor(RobotCanvas canvas) {
            this.canvas = canvas;
        }
        public abstract void execute();
    }

    class GoExecutor extends RobotExecutor {
        public GoExecutor(RobotCanvas canvas) {
            super(canvas);
        }
        @Override
        public void execute() {
            canvas.go(RobotCanvas.STEP_LENGTH);
        }
    }

    class DirectionExecutor extends RobotExecutor {
        private int relativeDirection;
        public DirectionExecutor(RobotCanvas canvas, int relativeDirection) {
            super(canvas);
            this.relativeDirection = relativeDirection;
        }
        @Override
        public void execute() {
            canvas.setRelativeDirection(relativeDirection);
        }
    }
}
