package ru.geekbrains.lesson3.cars;

import ru.geekbrains.lesson3.car_ability.Cleanable;
import ru.geekbrains.lesson3.car_ability.Refuelable;
import ru.geekbrains.lesson3.car_ability.Wiping;
import ru.geekbrains.lesson3.type_params.CarColor;
import ru.geekbrains.lesson3.type_params.CarType;
import ru.geekbrains.lesson3.type_params.FuelType;

public class SportCar extends Car implements Cleanable, Refuelable, Wiping {

    private int maxSpeed;

    public SportCar(String brand, String model, CarType carType, CarColor color, FuelType fuelType, int maxSpeed) {
        super(brand, model, carType, color, fuelType);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    @Override
    public void getFuel() {

    }

    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }
}
