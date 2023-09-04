package ru.geekbrains.lesson3.fuel_stations;

import ru.geekbrains.lesson3.type_params.FuelType;

/**
 * Заправочная станция
 */
public interface Refueling {

    /**
     * Заправка, передает топливо
     */
    void fuelProvide(FuelType fuelType);

}
