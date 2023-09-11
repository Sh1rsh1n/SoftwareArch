package ru.geekbrains.lesson4.homework.service;

import ru.geekbrains.lesson4.homework.entity.Customer;
import ru.geekbrains.lesson4.homework.entity.DataBase;
import ru.geekbrains.lesson4.homework.entity.Ticket;
import ru.geekbrains.lesson4.homework.exception.TicketNotFoundException;

import java.util.List;

public class TicketProvider {

    private DataBase dataBase;

    private PaymentProvider paymentProvider;

    public TicketProvider(DataBase dataBase, PaymentProvider paymentProvider) {
        this.dataBase = dataBase;
        this.paymentProvider = paymentProvider;
    }


    /**
     * покупка билета
     * проверка платежных данных покупателя, если все верно, присваиваем покупателя билету
     * @param customer
     */
    public void buyTicket(Customer customer) {
        if (paymentProvider.checkCustomerData(customer)) {
            dataBase.setCustomerToTicket(customer);
        }
    }

    /**
     * получаем покупателя по билету
     * @param customer
     * @return
     * @throws TicketNotFoundException
     */
    public Ticket getTicket(Customer customer) throws TicketNotFoundException {
        return dataBase.getTicketByCustomer(customer);
    }

    /**
     * получаем список всех билетов
     * @return
     */
    public List<Ticket> ticketList() {
        return dataBase.getTicketList();
    }

    public PaymentProvider getPaymentProvider() {
        return paymentProvider;
    }

    /**
     * проверка билета по номеру и секретному коду
     * @param id
     * @param secretCode
     * @return
     */
    public boolean checkTicket(int id, String secretCode) {
        for (Ticket ticket: dataBase.getTicketList()) {
            if (ticket.getSecretCode().equals(secretCode) && ticket.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
