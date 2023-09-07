package ru.geekbrains.lesson3.supports.fuel_station;

import ru.geekbrains.lesson3.car_models.parameters.FuelType;

public class RefuelingStation implements Refueling {

    private String title;

    public RefuelingStation(String title) {
        this.title = title;
    }

    /**
     * метод, описание заправки а/м топливом, в зависимости от того накаком топливе работает а/м.
     */
    @Override
    public void refuel(FuelType fuelType) {
        System.out.printf("Добро пожаловать на АЗС %s!!!\n", title);
        switch (fuelType){
            case DIESEL -> System.out.println("Заправка дизельным топливом");
            case GASOLINE -> System.out.println("Заправка бензином");
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Заправка завершена.");
    }
}
