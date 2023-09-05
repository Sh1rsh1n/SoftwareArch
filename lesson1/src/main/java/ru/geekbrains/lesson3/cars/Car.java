package ru.geekbrains.lesson3.cars;

import ru.geekbrains.lesson3.type_params.CarColor;
import ru.geekbrains.lesson3.type_params.CarType;
import ru.geekbrains.lesson3.type_params.FuelType;
import ru.geekbrains.lesson3.type_params.GearboxType;


public abstract class Car {

    //region Constructors

    public Car(String brand, String model, CarType type, CarColor color, FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.fuelType = fuelType;
    }

    //endregion

    //region Public Methods

    // Движение
    public abstract void movement();
    // Обслуживание
    public abstract void maintenance();
    // Переключение передач
    public abstract boolean gearShifting();
    // Включение дворников
    public abstract boolean switchWipers();

    public boolean switchLight(){
        lightOn = !lightOn;
        return lightOn;
    }

    protected void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    
    public CarType getCarType() {
        return type;
    }
    
    publc FuelType getFuelType() {
        return fuelType;
    }

    //endregion

    //region Private Fields

    // Марка автомобиля
    private String brand;

    // Модель
    private String model;

    // Цвет
    private CarColor color;

    // Тип
    private CarType type;

    // Число колес
    private int wheelsCount;

    // Тип топлива
    private FuelType fuelType;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;

    // Состояние противотуманных фар
    private boolean lightOn = false;


    //endregion



}
