package ru.geekbrains.lesson4.homework.entity;


public class Ticket {

    private static int incrementId;

    private final int id;

    private Customer customer;

    private String secretCode;

    public Ticket() {
        this.id = ++incrementId;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    /**
     * устанавливаем покупателя билету
     * добавляем секретный код на основе длины имени и фамилии покупателя и ID билета
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
        secretCode = String.format("%s-%s-%d", customer.getName().length(), customer.getSurname().length(), id);
    }

    public String getSecretCode() {
        return secretCode;
    }
}
