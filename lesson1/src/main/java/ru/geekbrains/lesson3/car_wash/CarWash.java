package ru.geekbrains.lesson3.car_wash;


public class CarWash implements Cleaning {

    private String washTitle;
    
    public CarWash(String washTitle) {
        this.washTitle = washTitle;
    }
    
    public String getWashTitle(){
        return washTitle;
    }
    
    public void washCar(Cleanable cleanableCar){
        int wt = waitTime(cleanableCar.getCarType);
        System.out.printf("Детейлинг центр: %s \nМашина %s заехала на мойку\n", washTitle, cleanableCar);
        System.out.printf("Время ожидания = %d минут\n", wt);
        System.timeout(wt * 100);
    }
    
    public void cleanCarInside(Cleanable cleanableCar){
        int wt = waitTime(cleanableCar.getCarType);
        System.out.printf("Детейлинг центр: %s \nМашина %s заехала на уборку салона\n", washTitle, cleanableCar);
        System.out.printf("Время ожидания = %d минут\n", wt);
        System.timeout(wt * 100);
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