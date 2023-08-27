package ru.geekbrains.lesson1.store3D.models.elements;

public class Angle3D {

    private int angle;

    public Angle3D() {
        this.angle = 0;
    }

    public Angle3D(int angle) {
        this.angle = checkAngle(angle);
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = checkAngle(angle);
    }

    private int checkAngle(int angle) {
        if (angle > 360 || angle < 0) {
            throw new RuntimeException("Некорректное значение положения угла");
        }
        return angle;
    }
}
