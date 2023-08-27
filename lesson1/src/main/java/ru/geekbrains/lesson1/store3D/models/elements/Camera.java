package ru.geekbrains.lesson1.store3D.models.elements;

public class Camera extends View {

    private Point3D location;

    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        super(location, angle);
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void rotateCamera(Angle3D angle) {
        this.angle = angle;
    }

    public void moveCamera(Point3D point) {
        this.location = point;
    }

}
