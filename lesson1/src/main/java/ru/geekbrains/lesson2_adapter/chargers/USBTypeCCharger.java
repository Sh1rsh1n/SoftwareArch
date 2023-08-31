package ru.geekbrains.lesson2_adapter.chargers;

public class USBTypeCCharger extends MobilePhoneCharger{

    private int power;

    public USBTypeCCharger(int power) {
        this.power = power;
        System.out.printf("Зарядка подключена к адаптеру через USB TYPE-C\nМощность: %d\n", power);
    }

    public int getPower() {
        return power;
    }
}
