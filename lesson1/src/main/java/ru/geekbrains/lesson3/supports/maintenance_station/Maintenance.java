package ru.geekbrains.lesson3.supports.maintenance_station;

import ru.geekbrains.lesson3.car_models.Car;

public interface Maintenance {
    
    void changeOil(Car car);
    
    void changeFilters(Car car);
}