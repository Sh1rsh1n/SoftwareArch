package ru.geekbrains.lesson2_adapter.files.mobiles;

import ru.geekbrains.lesson2_adapter.files.chargers.Charger;

public abstract class MobilePhone {

    protected Charger charger;

    public MobilePhone(Charger charger) {
        this.charger = charger;
    }

    protected abstract void checkCharger();
}
