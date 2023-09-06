package ru.geekbrains.lesson3.car_models;

import ru.geekbrains.lesson3.car_models.abilities.Cleanable;
import ru.geekbrains.lesson3.car_models.parameters.BodyType;
import ru.geekbrains.lesson3.car_models.parameters.CarColor;
import ru.geekbrains.lesson3.car_models.parameters.FuelType;

public abstract class Car implements Cleanable {

    // Марка автомобиля
    private String brand;

    // Модель
    private String model;

    // Цвет
    private CarColor color;

    // Тип
    private BodyType bodyType;

    // Тип топлива
    private FuelType fuelType;

    // пройденный путь
    private int tripDistance;
    
    // Текущая скорость
    protected int averageSpeed;
    
    // максимальная скорость
    protected int maxSpeed;

    // уровень топлива
    protected float fuelLevel;

    // необходимость ТО
    protected boolean needMaintenance;


    public Car(String brand, String model, BodyType bodyType, CarColor color, FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.fuelType = fuelType;
        this.tripDistance = 0;
        averageSpeed = 0;
        fuelLevel = 1.0f;
        needMaintenance = false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public CarColor getColor() {
        return color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getTripDistance() {
        return tripDistance;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public boolean isNeedMaintenance() {
        return needMaintenance;
    }

    public void setTripDistance(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public void setFuelLevel(float fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setNeedMaintenance(boolean needMaintenance) {
        this.needMaintenance = needMaintenance;
    }

    // Движение
    public abstract void movement();
    
    // Обслуживание
    public abstract void maintenance();
}
