package ru.geekbrains.lesson2_adapter;

import ru.geekbrains.lesson2_adapter.chargers.MobilePhoneCharger;

public class Adapter implements LightningAdapter {

    private MobilePhoneCharger charger;

    public Adapter(MobilePhoneCharger charger) {
        this.charger = charger;
    }

    public void transferEnergy() {
        System.out.println("Идет зарядка.");
    }
}
