package ru.geekbrains.lesson2_adapter.files.adapters;

public class USBTypeCAdapter extends Adapter{

    public USBTypeCAdapter(int power) {
        super(power);
    }

    @Override
    public void transferEnergy() {
        System.out.printf("Идет зарядка. Тип устройства: USBTypeC. Мощность: %d", power);
    }
}
