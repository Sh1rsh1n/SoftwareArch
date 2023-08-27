package ru.geekbrains.lesson1.store3D.models.elements;

public abstract class View {

    private Point3D location;

    private Angle3D angle;

    public View(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public abstract void rotate(Angle3D angle);

    public abstract void move(Point3D point);

}
