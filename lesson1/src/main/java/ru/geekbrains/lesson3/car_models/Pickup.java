package ru.geekbrains.lesson3.car_models;

import ru.geekbrains.lesson3.car_models.abilities.Cleanable;
import ru.geekbrains.lesson3.car_models.parameters.BodyType;
import ru.geekbrains.lesson3.car_models.parameters.CarColor;
import ru.geekbrains.lesson3.car_models.parameters.FuelType;

import java.util.Random;

public class Pickup extends Car {

    private float dirtLevel;

    private boolean extraMaintenance;

    public Pickup(String brand, String model, BodyType bodyType, CarColor color, FuelType fuelType) {
        super(brand, model, bodyType, color, fuelType);
        this.extraMaintenance = false;
        this.dirtLevel = 0.0f;

    }

    public float getDirtLevel() {
        return dirtLevel;
    }

    public void setDirtLevel(float dirtLevel) {
        this.dirtLevel = dirtLevel;
    }

    @Override
    public void movement() {
        averageSpeed = new Random().nextInt(maxSpeed);
        System.out.printf("Средняя скорость км/ч: %d\n", averageSpeed);

        setTripDistance(getTripDistance() + averageSpeed);
        System.out.printf("Проехал: %d\n", getTripDistance());

        setFuelLevel(getFuelLevel() - ((float) averageSpeed / maxSpeed / 3));
        System.out.printf("Остаток топлива: %f бака\n", getFuelLevel());

        setDirtLevel(dirtLevel + averageSpeed / 100f);


    }

    @Override
    public void maintenance() {
        if (extraMaintenance) {
            extraMaintenance = false;
            setNeedMaintenance(true);
            System.out.println("Пора делать ТО");
        }
    }


}
