package ru.geekbrains.lesson2_adapter;

import ru.geekbrains.lesson2_adapter.chargers.MobilePhoneCharger;
import ru.geekbrains.lesson2_adapter.chargers.USBTypeCCharger;

public class MainApp {

    public static void main(String[] args) {

        MobilePhoneCharger charger = new USBTypeCCharger(30);

        LightningAdapter adapter = new Adapter(charger);

        iPhone iPhone = new iPhone(adapter);
        iPhone.getCharger().transferEnergy();
    }
}
