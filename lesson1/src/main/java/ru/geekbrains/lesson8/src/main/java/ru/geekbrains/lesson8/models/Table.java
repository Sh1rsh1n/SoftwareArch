package ru.geekbrains.lesson8.src.main.java.ru.geekbrains.lesson8.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    public int getNo() {
        return no;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    private final Collection<Reservation> reservations = new ArrayList<>();

    private static int counter;
    private final int no;

    private boolean available;

    {
        no = ++counter;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d %s", no, available ? "забронирован": "доступен");
    }
}
