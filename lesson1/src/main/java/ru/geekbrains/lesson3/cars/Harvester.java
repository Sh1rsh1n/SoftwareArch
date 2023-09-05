package ru.geekbrains.lesson3.cars;

import ru.geekbrains.lesson3.car_ability.Cleanable;
import ru.geekbrains.lesson3.car_ability.Refuelable;
import ru.geekbrains.lesson3.car_ability.Wiping;
import ru.geekbrains.lesson3.type_params.CarColor;
import ru.geekbrains.lesson3.type_params.CarType;
import ru.geekbrains.lesson3.type_params.FuelType;


public class Harvester extends Car implements Refuelable, Wiping, Cleanable {

    public Harvester(String brand, String model, CarType carType, CarColor color, FuelType fuelType) {
        super(brand, model, carType, color, fuelType);
        setWheelsCount(6);
    }

//    public void setRefuelingStation(Refueling refuelingStation) {
//        this.refueling = refuelingStation;
//    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void getFuel() {

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

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
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
