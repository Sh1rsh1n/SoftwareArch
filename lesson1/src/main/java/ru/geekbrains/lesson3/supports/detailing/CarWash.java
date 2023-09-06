package ru.geekbrains.lesson3.car_wash;


import ru.geekbrains.lesson3.car_ability.Cleanable;
import ru.geekbrains.lesson3.cars.Car;
import ru.geekbrains.lesson3.type_params.CarType;

public class CarWash implements Cleaning {

    private String washTitle;
    
    public CarWash(String washTitle) {
        this.washTitle = washTitle;
    }
    
    public String getWashTitle(){
        return washTitle;
    }

    @Override
    public void washCar(Car<? extends Cleanable> car) {
        int wt = waitTime(car.getCarType());
        System.out.printf("Детейлинг центр: %s \nМашина <<%s %s>> заехала на мойку\n", washTitle, car.getBrand(), car.getModel());
        System.out.printf("Время ожидания = %d минут\n", wt);
        try {
            Thread.sleep(wt * 100L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void cleanCarInside(Car<? extends Cleanable> car){
        int wt = waitTime(car.getCarType());
        System.out.printf("Детейлинг центр: %s \nМашина %s заехала на уборку салона\n", washTitle, car);
        System.out.printf("Время ожидания = %d минут\n", wt);
        try {
            Thread.sleep(wt * 100L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    
    private int waitTime(CarType type) {
        int time = 0;
        switch (type) {
            case Sedan -> time = 30;
            case Hatchback -> time = 25;
            case Pickup -> time= 50;
            case Sport -> time = 15;
        }
        return time;
    }
}