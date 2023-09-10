package ru.geekbrains.lesson4.homework.view;

import ru.geekbrains.lesson4.homework.service.TicketServiceApi;

/**
 * Покупка билетов через мобильное приложение
 */
public class MobileApp implements ServiceConnection {

    private TicketServiceApi ticketServiceApi;

    public MobileApp(TicketServiceApi ticketServiceApi) {
        this.ticketServiceApi = ticketServiceApi;
        System.out.println("Покупка билетов через мобильное приложение");
    }

    @Override
    public void apiConnect() {
        ticketServiceApi.connect();
    }
}
