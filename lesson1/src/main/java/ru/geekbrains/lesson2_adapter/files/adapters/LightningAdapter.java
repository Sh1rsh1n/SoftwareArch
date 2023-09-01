package ru.geekbrains.lesson2_adapter.files.adapters;

public class LightningAdapter extends Adapter{

    public LightningAdapter(int power) {
        super(power);
    }

    @Override
    public void transferEnergy() {
        System.out.printf("Идет зарядка. Мощность: %d", power);
    }
}
