package ru.geekbrains.lesson3.fuel_stations;

import ru.geekbrains.lesson3.type_params.FuelType;

public class RefuelingStationV2 implements Refueling {
    @Override
    public void fuelProvide(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка дизельным топливом");
            case Gasoline -> System.out.println("Заправка бензином");
        }
    }
}