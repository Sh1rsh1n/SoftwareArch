package ru.geekbrains.lesson4.homework.entity;


import ru.geekbrains.lesson4.homework.service.TicketProvider;

public class BusStation {

    private TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider){
        this.ticketProvider = ticketProvider;
    }

    /**
     * проверка секретного кода
     * @param id
     * @param secretCode
     * @return
     */
    public boolean checkTicket(int id, String secretCode){
        return ticketProvider.checkTicket(id, secretCode);
    }
}
