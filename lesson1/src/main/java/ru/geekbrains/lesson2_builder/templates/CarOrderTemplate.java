package ru.geekbrains.lesson2_builder.templates;

import ru.geekbrains.lesson2_builder.pojo.Car;

public interface CarOrderTemplate {

    Car build();

    CarOrderTemplate setBrand(String brand);

    CarOrderTemplate setModel(String model);

    CarOrderTemplate setEnginePower(int enginePower);

    CarOrderTemplate setBodyType(String bodyType);

    CarOrderTemplate setDoorsAmount(int doorsAmount);

    CarOrderTemplate setSeatsMaterial(String material);
}
