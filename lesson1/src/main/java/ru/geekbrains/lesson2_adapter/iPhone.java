package ru.geekbrains.lesson2_adapter;

public class iPhone {

    private LightningAdapter charger;

    public iPhone(LightningAdapter charger) {
        this.charger = charger;
        System.out.println("Адаптер подключен");
    }

    public LightningAdapter getCharger() {
        return charger;
    }
}
