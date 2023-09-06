package ru.geekbrains.lesson3.car_models;

import ru.geekbrains.lesson3.car_models.abilities.Cleanable;
import ru.geekbrains.lesson3.car_models.parameters.BodyType;
import ru.geekbrains.lesson3.car_models.parameters.CarColor;
import ru.geekbrains.lesson3.car_models.parameters.FuelType;

import java.util.Random;

public class SportCar extends Car {

    protected int maxSpeed;

    private int maintenanceDistance;
    
    public SportCar(String brand, String model, BodyType bodyType, CarColor color, FuelType fuelType, int maxSpeed) {
        super(brand, model, bodyType, color, fuelType);
        this.maxSpeed = maxSpeed;
        maintenanceDistance = 3000;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    @Override
    public void movement(){
        averageSpeed = new Random().nextInt(maxSpeed);
        System.out.printf("Средняя скорость км/ч: %d\n", averageSpeed);

        setTripDistance(getTripDistance() + averageSpeed);
        System.out.printf("Проехал: %d\n", getTripDistance());

        setFuelLevel(getFuelLevel() - ((float) averageSpeed / maxSpeed / 3));
        System.out.printf("Остаток топлива: %f бака\n", getFuelLevel());
        
    }
    
    @Override
    public void maintenance(){
        if (getTripDistance() > maintenanceDistance) {
            maintenanceDistance *= 2;
            setNeedMaintenance(true);
            System.out.println("Пора делать ТО");
        }
        
    }
}