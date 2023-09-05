package ru.geekbrains.lesson3.car_wash;


import ru.geekbrains.lesson3.car_ability.Cleanable;
import ru.geekbrains.lesson3.cars.Car;

public interface Cleaning {

    void washCar(Car<? extends Cleanable> car);
    void cleanCarInside(Car<? extends Cleanable> car);
}