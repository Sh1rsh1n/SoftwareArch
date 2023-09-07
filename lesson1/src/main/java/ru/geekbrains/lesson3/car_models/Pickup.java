package ru.geekbrains.lesson3.car_models;

import ru.geekbrains.lesson3.car_models.abilities.Cleanable;
import ru.geekbrains.lesson3.car_models.parameters.BodyType;
import ru.geekbrains.lesson3.car_models.parameters.CarColor;
import ru.geekbrains.lesson3.car_models.parameters.FuelType;

import java.util.Random;

public class Pickup extends Car {

    // уровень загрязнения
    private float dirtLevel;

    // срочное ТО
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
    
        // средняя скорость
        averageSpeed = new Random().nextInt(maxSpeed);
        System.out.printf("Средняя скорость км/ч: %d\n", averageSpeed);

        // вычислили пройденный путь и присвоили новое значение
        setTripDistance(getTripDistance() + averageSpeed);
        System.out.printf("Проехал: %d\n", getTripDistance());

        /**
         * вычислили количество потраченного топлива за пройденный путь
         * чем выше средняя скорость тем больше расход
         */
        setFuelLevel(getFuelLevel() - ((float) averageSpeed / maxSpeed / 3));
        System.out.printf("Остаток топлива: %f бака\n", getFuelLevel());
        

        // вычисляем уровень загрязнения кузова и устанавливаем новое значение
        setDirtLevel(dirtLevel + averageSpeed / 100f);
        System.out.printf("Уровень загрязнения кузова: %f \n", getDirtLevel());
        
        // просто рандомное значение для ТО
        if (getTripDistance() % 100 == 0) {
            extraMaintenance = true;
        } 

    }

    @Override
    public void maintenance() {
        // необходимость срочного ТО
        if (extraMaintenance) {
            extraMaintenance = false;
            setNeedMaintenance(true);
            System.out.println("Нужно срочно делать ТО");
        }
    }


}
