package ru.geekbrains.lesson3.supports.fuel_station;


import ru.geekbrains.lesson3.car_models.parameters.FuelType;

/**
 * Заправочная станция
 */
public interface Refueling {

    /**
     * Заправка, передает топливо
     */
    void refuel(FuelType fuelType);

}
