package ru.geekbrains.lesson2_adapter.files;

import ru.geekbrains.lesson2_adapter.files.adapters.LightningAdapter;
import ru.geekbrains.lesson2_adapter.files.adapters.USBTypeCAdapter;
import ru.geekbrains.lesson2_adapter.files.chargers.Charger;
import ru.geekbrains.lesson2_adapter.files.mobiles.IPhone;

public class MainApp {

    public static void main(String[] args) {
        Charger charger = new LightningAdapter(15);
        Charger chargerUSB = new USBTypeCAdapter(25);

        IPhone iPhone1 = new IPhone(charger);
        System.out.println("\n");
        IPhone iPhone2 = new IPhone(chargerUSB);

    }
}
