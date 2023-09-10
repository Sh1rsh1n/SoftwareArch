package ru.geekbrains.lesson4.homework.entity;


import java.util.Objects;

/**
 * Покупатель
 */
public class Customer{

    private static int incrementId;

    private final int id;

    private String name;

    private String surname;

    private String login;

    private String password;

    private CreditCard card;


    public Customer(String name, String surname) {
        this.id = ++incrementId;
        this.name = name;
        this.surname = surname;
        login = surname.charAt(0) + name;
        password = String.valueOf(name.length()) + surname.length();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (!Objects.equals(name, customer.name)) return false;
        if (!Objects.equals(surname, customer.surname)) return false;
        if (!Objects.equals(login, customer.login)) return false;
        if (!Objects.equals(password, customer.password)) return false;
        return Objects.equals(card, customer.card);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (card != null ? card.hashCode() : 0);
        return result;
    }
}
