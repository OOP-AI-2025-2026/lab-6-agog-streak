package ua.opnu.model;

import java.awt.*;

public abstract class DrawShape {

    public static final int SHAPE_RECTANGLE = 0;
    public static final int SHAPE_ROUNDED_RECT = 1;
    public static final int SHAPE_ELLIPSE = 2;

    private Point startPoint;
    private Point endPoint;

    public DrawShape() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public DrawShape(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public static DrawShape newInstance(int shapeType) {
        DrawShape shape = null;
        if (shapeType == SHAPE_RECTANGLE) {
            shape = new Rectangle();
        } else if (shapeType == SHAPE_ROUNDED_RECT) {
            shape = new ua.opnu.model.RoundedRectangle();
        } else if (shapeType == SHAPE_ELLIPSE) {
            shape = new ua.opnu.model.Ellipse();
        }
        return shape;
    }

    public abstract Shape getShape(Point startPoint, Point endPoint);

    public Shape getShape() {
        return getShape(startPoint, endPoint);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}

