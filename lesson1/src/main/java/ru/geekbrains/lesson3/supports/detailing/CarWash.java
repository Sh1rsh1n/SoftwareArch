package ru.geekbrains.lesson3.supports.detailing;


import ru.geekbrains.lesson3.car_models.Car;
import ru.geekbrains.lesson3.car_models.abilities.Cleanable;
import ru.geekbrains.lesson3.car_models.parameters.BodyType;

public class CarWash implements Cleaning {

    private String washTitle;
    
    public CarWash(String washTitle) {
        this.washTitle = washTitle;
    }
    
    public String getWashTitle(){
        return washTitle;
    }

    @Override
    public void washCar(Object obj) {
        if (obj instanceof Cleanable) {
            Car car = (Car) obj;
            int wt = waitTime(car.getBodyType());
            System.out.printf("Детейлинг центр: %s \nМашина << %s %s >> заехала на мойку\n", washTitle, car.getBrand(), car.getModel());
            System.out.printf("Время ожидания = %d минут\n", wt);
            try {
                Thread.sleep(wt * 100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void cleanCarInside(Object obj){
        if (obj instanceof Cleanable) {
            Car car = (Car) obj;
            int wt = waitTime(car.getBodyType());
            System.out.printf("Детейлинг центр: %s \nМашина << %s %s >> заехала на уборку салона\n", washTitle, car.getBrand(), car.getModel());
            System.out.printf("Время ожидания = %d минут\n", wt);
            try {
                Thread.sleep(wt * 100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    private int waitTime(BodyType type) {
        int time = 0;
        switch (type) {
            case SEDAN -> time = 30;
            case HATCHBACK -> time = 25;
            case PICKUP -> time= 50;
            case COUPE -> time = 15;
        }
        return time;
    }
}