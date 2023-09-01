package ru.geekbrains.lesson2_adapter.files.mobiles;

import ru.geekbrains.lesson2_adapter.files.chargers.Charger;
import ru.geekbrains.lesson2_adapter.files.adapters.LightningAdapter;

public class IPhone extends MobilePhone{

    public IPhone(Charger charger) {
        super(charger);
        System.out.println("Подключение зарядки к iPhone...");
        checkCharger();
    }

    @Override
    protected void checkCharger() {

        if (charger instanceof LightningAdapter){
            charger.transferEnergy();
            return;
        }
        throw new RuntimeException("Некорректный тип зарядного устройства, зарядка невозможна.");
    }
}
