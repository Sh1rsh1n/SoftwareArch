package ru.geekbrains.lesson3.cars;

import ru.geekbrains.lesson3.car_ability.Wiping;
import ru.geekbrains.lesson3.car_ability.Fueling;
import ru.geekbrains.lesson3.fuel_stations.Refueling;
import ru.geekbrains.lesson3.type_params.CarColor;


public class Harvester extends Car implements Fueling, Wiping {

    private Refueling refueling;
    
    private Cleaning cleaning;

    public Harvester(String brand, String model, CarColor color) {
        super(brand, model, color);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void getFuel() {
        if (refueling != null){
            refueling.fuelProvide(fuelType);
        }
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
    public boolean switchHeadlights() {
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
