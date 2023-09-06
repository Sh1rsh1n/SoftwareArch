package ru.geekbrains.lesson3.cars;

import ru.geekbrains.lesson3.car_ability.Cleanable;
import ru.geekbrains.lesson3.type_params.CarColor;
import ru.geekbrains.lesson3.type_params.CarType;
import ru.geekbrains.lesson3.type_params.FuelType;
import ru.geekbrains.lesson3.type_params.GearboxType;


public abstract class Car<T> implements Cleanable {

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
    
    // Текущая скорость
    protected int currentSpeed;
    
    // максимальная скорость
    protected int maxSpeed;

    // уровень топлива
    protected float fuelLevel;
    
    protected boolean needMaintenance;


    public Car(String brand, String model, BodyType bodyType, CarColor color, FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.fuelType = fuelType;
        currentSpeed = 0;
        fuelLevel = 1.0f;
        needMaintenance = false;
    }

    // Движение
    public abstract void movement();
    
    // Обслуживание
    public abstract void maintenance();
}
