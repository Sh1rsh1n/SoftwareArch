package ru.geekbrains.lesson2.templates;

import ru.geekbrains.lesson2.pojo.Car;

public interface TransportOrderTemplate {

    Car build();

    TransportOrderTemplate setBrand(String brand);

    TransportOrderTemplate setModel(String model);

    TransportOrderTemplate setEnginePower(int enginePower);

    TransportOrderTemplate setBodyType(String bodyType);

    TransportOrderTemplate setDoorsAmount(int doorsAmount);

    TransportOrderTemplate setSeatsMaterial(String material);
}
