package ru.geekbrains.lesson3.supports.maintenance_station;

import ru.geekbrains.lesson3.car_models.Car;

public class MaintenanceStation implements Maintenance{

    private String title;

    public MaintenanceStation(String title) {
        this.title = title;
    }

    @Override
    public void changeOil(Car car){
        System.out.printf("Выполняется замена масла в автомобиле == %s %s ==\n", car.getBrand(), car.getModel());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void changeFilters(Car car){
        System.out.printf("Выполняется замена фильтров в автомобиле == %s %s ==\n", car.getBrand(), car.getModel());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}