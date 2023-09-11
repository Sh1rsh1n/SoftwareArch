package ru.geekbrains.lesson4.homework.entity;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

/**
 * Банк
 * Имеет список кредитных карт
 */
public class Bank {

    private final Map<Integer, CreditCard> cards;

    /**
     * генерация пустых кредитных карт (без покупателя)
     */
    public Bank() {
        cards = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            cards.put(i, new CreditCard());
        }
    }

    public Map<Integer, CreditCard> getCards() {
        return Map.copyOf(cards);
    }

    /**
     * присваиваем кредитной карте покупателя
     * при этом вначале проверяем есть ли карта у данного покупателя
     * @param customer - покупатель
     */
    public void setCustomerToCard(Customer customer) {
        for (Map.Entry<Integer, CreditCard> card : cards.entrySet()) {
            if (customer.getCard() == null) {
                card.getValue().setCustomer(customer);
                System.out.println("++ ПОКУПАТЕЛЮ ДОБАВЛЕНА КРЕДИТНАЯ КАРТА ++");
                System.out.printf("++ НОМЕР КАРТЫ: %s **** **** %s ++\n", customer.getCard().getCardNumber().substring(0, 4), customer.getCard().getCardNumber().substring(12));
                return;
            }
        }
    }
}
