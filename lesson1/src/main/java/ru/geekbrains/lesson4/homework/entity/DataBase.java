package ru.geekbrains.lesson4.homework.entity;

import ru.geekbrains.lesson4.homework.exception.TicketNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<Customer> customerList;

    private final List<Ticket> ticketList = new ArrayList<>();

    {
        for (int i = 0; i < 10; i++) {
            ticketList.add(new Ticket());
            System.out.println(ticketList.get(i));
        }
    }

    public DataBase() {
        customerList = new ArrayList<>();
    }

    public List<Customer> getCustomerList() {
        return List.copyOf(customerList);
    }

    /**
     * добавление пользователя в БД
     * если БД пустая, то сразу добавляем,
     * иначе выполняем поиск покупателя в БД, если покупатель отсутствует, то добавляем его в БД
     * @param customer
     */
    public void addCustomerToDataBase(Customer customer) {
        if (customerList.isEmpty()) {
            customerList.add(customer);
            System.out.println("++ ПОКУПАТЕЛЬ УСПЕШНО ДОБАВЛЕН В БД ++");
            return;
        }
        for (Customer customer1: customerList) {
            if (customer1.equals(customer)) {
                System.out.println("!! ТАКОЙ ПОКУПАТЕЛЬ УЖЕ ЕСТЬ В СПИСКЕ !!");
                return;
            }
        }
        customerList.add(customer);
        System.out.println("++ ПОКУПАТЕЛЬ УСПЕШНО ДОБАВЛЕН В БД ++");
    }

    public void setCustomerToTicket(Customer customer) {
        for (Ticket ticket: ticketList) {
            if (ticket.getCustomer() == null) {
                ticket.setCustomer(customer);
                System.out.printf("Билет #%d, Секретный код: %s,  Имя %s Фамилия %s", ticket.getId(), ticket.getSecretCode(), ticket.getCustomer().getName(), ticket.getCustomer().getSurname());
                return;
            }
        }
        System.out.println("Все билеты проданы.");
    }

    public Ticket getTicketByCustomer(Customer customer) throws TicketNotFoundException {
        for (Ticket ticket: ticketList) {
            if (ticket.getCustomer().equals(customer)) {
                return ticket;
            }
        }
        throw new TicketNotFoundException("Билет не найден.");
    }

    public List<Ticket> getTicketList() {
        return List.copyOf(ticketList);
    }
}
