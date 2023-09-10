package ru.geekbrains.lesson4.homework.entity;

import java.util.Objects;
import java.util.Random;

/**
 * Кредитная карта
 */
public class CreditCard {

    private Customer customer;

    private String cardNumber;

    private String ownerNameSurname;

    private String cvv;

    public CreditCard() {
        this.cardNumber = randomValue(16);
        this.cvv = randomValue(3);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        ownerNameSurname = customer.getName().toUpperCase() + customer.getSurname().toUpperCase();
        customer.setCard(this);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwnerNameSurname() {
        return ownerNameSurname;
    }

    public String getCvv() {
        return cvv;
    }

    /**
     * рандомное значение для номера карты и CVV
     * @param bound - количество цифр которые будут в возвращаемом значении
     * @return String
     */
    private String randomValue(int bound) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bound; i++) {
            sb.append(new Random().nextInt(9));
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCard card = (CreditCard) o;

        if (!Objects.equals(customer, card.customer)) return false;
        if (!Objects.equals(cardNumber, card.cardNumber)) return false;
        if (!Objects.equals(ownerNameSurname, card.ownerNameSurname))
            return false;
        return Objects.equals(cvv, card.cvv);
    }

    @Override
    public int hashCode() {
        int result = customer != null ? customer.hashCode() : 0;
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        result = 31 * result + (ownerNameSurname != null ? ownerNameSurname.hashCode() : 0);
        result = 31 * result + (cvv != null ? cvv.hashCode() : 0);
        return result;
    }
}
