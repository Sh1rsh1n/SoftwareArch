package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.car_models.Car;
import ru.geekbrains.lesson3.car_models.Pickup;
import ru.geekbrains.lesson3.supports.detailing.Cleaning;
import ru.geekbrains.lesson3.supports.fuel_station.Refueling;
import ru.geekbrains.lesson3.supports.maintenance_station.Maintenance;

public class Trip {
    
    private Car car;
    
    private int tripDistance;
    
    private Refueling refueling;
    
    private Cleaning cleaning;

    private Maintenance maintenance;
    
    public Trip(Car car, Refueling refueling, Cleaning cleaning, Maintenance maintenance, int tripDistance) {
        this.car = car;
        this.refueling = refueling;
        this.cleaning = cleaning;
        this.maintenance = maintenance;
        this.tripDistance = tripDistance;
    }
    
    public void start() {

        System.out.printf("Начало путешествия на автомобиле %s %s\n", car.getBrand(), car.getModel());
        
        while(car.getTripDistance() <= tripDistance) {
            car.movement();
            car.maintenance();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (car instanceof Pickup && ((Pickup) car).getDirtLevel() >= 0.5f) {
                cleaning.washCar(car);
                cleaning.cleanCarInside(car);
                ((Pickup) car).setDirtLevel(0.0f);
            }

            if (car.isNeedMaintenance()) {
                cleaning.washCar(car);
                cleaning.cleanCarInside(car);
                maintenance.changeOil(car);
                maintenance.changeFilters(car);
                car.setNeedMaintenance(false);
            }

            if (car.getFuelLevel() < 0) {
                System.out.println("Закончился бензин. Дальше ехать нельзя.");
                break;
            }

            if (car.getFuelLevel() < 0.25f) {
                refueling.refuel(car.getFuelType());
                car.setFuelLevel(1.0f);
            }


        }

        System.out.printf("Конец путешествия на автомобиле %s %s\n", car.getBrand(), car.getModel());

    }
}