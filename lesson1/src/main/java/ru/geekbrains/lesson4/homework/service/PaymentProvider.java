package ru.geekbrains.lesson4.homework.service;

import ru.geekbrains.lesson4.homework.entity.Bank;
import ru.geekbrains.lesson4.homework.entity.CreditCard;
import ru.geekbrains.lesson4.homework.entity.Customer;

import java.util.Map;

public class PaymentProvider {

    private Bank bank;

    public PaymentProvider(Bank bank) {
        this.bank = bank;
    }

    /**
     * проверка кредитной карты покупателя
     * проверяем номер карты, имени и фамилии владельца и CVV на наличие в БД банка
     * @param customer покупатель
     * @return boolean
     */
    public boolean checkCustomerData(Customer customer) {
        for (Map.Entry<Integer, CreditCard> cardEntry: bank.getCards().entrySet()) {
            if (cardEntry.getValue().getCardNumber().equals(customer.getCard().getCardNumber())
                    && cardEntry.getValue().getCvv().equals(customer.getCard().getCvv())
                    && cardEntry.getValue().getOwnerNameSurname().equals(customer.getCard().getOwnerNameSurname())) {
                System.out.println("== ВАЛИДНЫЕ ДАННЫЕ КРЕДИТНОЙ КАРТЫ ПОКУПАТЕЛЯ ==\n== ТРАНЗАКЦИЯ ВЫПОЛНЕНА УСПЕШНО ==");
                return true;
            }
        }
        System.out.println("== НЕВЕРНЫЕ ДАННЫЕКРЕДИТНОЙ КАРТЫ ПОКУПАТЕЛЯ ==\n== ТРАНЗАКЦИЯ ОТМЕНЕНА ==");
        return false;
    }

    public Bank getBank() {
        return bank;
    }
}
