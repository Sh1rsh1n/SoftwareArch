package ru.geekbrains.lesson2_builder;

import ru.geekbrains.lesson2_builder.builders.CarOrderBuilder;
import ru.geekbrains.lesson2_builder.pojo.Car;

public class MainApp {

    public static void main(String[] args) {
        Car car = new CarOrderBuilder()
                .setBrand("BMW")
                .setBrand("BMW")
                .setModel("X5")
                .setBodyType("Liftback")
                .setEnginePower(500)
                .setDoorsAmount(5)
                .setSeatsMaterial("Leather")
                .build();

        Car car1 = new CarOrderBuilder()
                .setBrand("Skoda")
                .setModel("Octavia")
                .setBodyType("Hatchback")
                .setEnginePower(180)
                .setDoorsAmount(5)
                .setSeatsMaterial("Al'kantara")
                .build();

        System.out.println(car);
        System.out.println();
        System.out.println(car1);
    }
}
