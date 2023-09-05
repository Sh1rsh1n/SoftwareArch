package ru.geekbrains.lesson3.fuel_stations;

import ru.geekbrains.lesson3.type_params.FuelType;

public class RefuelingStation implements Refueling {

    private String title;

    public RefuelingStation(String title) {
        this.title = title;
    }

    @Override
    public void refuel(FuelType fuelType) {
        System.out.printf("Добро пожаловать на АЗС %s!!!\n", title);
        switch (fuelType){
            case Diesel -> System.out.println("Заправка дизельным топливом");
            case Gasoline -> System.out.println("Заправка бензином");
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Заправка завершена.");
    }
}
