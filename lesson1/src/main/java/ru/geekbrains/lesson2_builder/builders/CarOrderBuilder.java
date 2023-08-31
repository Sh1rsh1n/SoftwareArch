package ru.geekbrains.lesson2_builder.builders;

import ru.geekbrains.lesson2_builder.templates.CarOrderTemplate;
import ru.geekbrains.lesson2_builder.pojo.Car;

public class CarOrderBuilder implements CarOrderTemplate {

    private Car car;

    public CarOrderBuilder() {
        car = new Car();
    }

    @Override
    public CarOrderBuilder setBrand(String brand) {
        car.setBrand(brand);
        return this;
    }

    @Override
    public CarOrderBuilder setModel(String model) {
        car.setModel(model);
        return this;
    }

    @Override
    public CarOrderBuilder setEnginePower(int enginePower) {
        car.setEnginePower(enginePower);
        return this;
    }

    @Override
    public CarOrderBuilder setBodyType(String bodyType) {
        car.setBodyType(bodyType);
        return this;
    }

    @Override
    public CarOrderBuilder setDoorsAmount(int doorsAmount) {
        car.setDoorsAmount(doorsAmount);
        return this;
    }

    @Override
    public CarOrderBuilder setSeatsMaterial(String material) {
        car.setSeatsMaterial(material);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
