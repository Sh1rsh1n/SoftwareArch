package ru.geekbrains.lesson2.pojo;

public class Car {

    private String brand;

    private String model;

    private int enginePower;

    private String bodyType;

    private int doorsAmount;

    private String seatsMaterial;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getDoorsAmount() {
        return doorsAmount;
    }

    public void setDoorsAmount(int doorsAmount) {
        this.doorsAmount = doorsAmount;
    }

    public String getSeatsMaterial() {
        return seatsMaterial;
    }

    public void setSeatsMaterial(String seatsMaterial) {
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public String toString() {
        return String.format("Car: %s %s\nEngine power: %d hp\nBody type: %s\nDoors amount: %d\nSeats materilal: %s",
                brand, model, enginePower, bodyType, doorsAmount, seatsMaterial);
    }
}
