package ru.geekbrains.lesson2_adapter.files.adapters;

import ru.geekbrains.lesson2_adapter.files.chargers.Charger;

public abstract class Adapter implements Charger {

    protected int power;

    public Adapter(int power) {
        this.power = power;
    }

    public abstract void transferEnergy();
}
