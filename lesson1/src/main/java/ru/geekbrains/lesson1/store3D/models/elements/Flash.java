package ru.geekbrains.lesson1.store3D.models.elements;

public class Flash extends View {

    private Point3D location;

    private Angle3D angle;

    private Color color;

    private float power;

    public Flash(Point3D location, Angle3D angle) {
        super(location, angle);
        this.color = Color.BLACK;
        this.power = 1.0f;
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        if (power > 1.0f || power < 0.0f) {
            throw new RuntimeException("Некорректный уровень силы света");
        }
        this.power = power;
    }

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D point) {
        this.location = point;
    }
}
