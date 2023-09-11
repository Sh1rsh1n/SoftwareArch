package ru.geekbrains.lesson4.homework;

import ru.geekbrains.lesson4.homework.entity.Bank;
import ru.geekbrains.lesson4.homework.entity.BusStation;
import ru.geekbrains.lesson4.homework.entity.DataBase;
import ru.geekbrains.lesson4.homework.service.CustomerProvider;
import ru.geekbrains.lesson4.homework.service.PaymentProvider;
import ru.geekbrains.lesson4.homework.service.TicketProvider;
import ru.geekbrains.lesson4.homework.service.TicketServiceApi;
import ru.geekbrains.lesson4.homework.view.MobileApp;


public class MainApp {
    public static void main(String[] args) {

        // инициализация банка
        Bank bank = new Bank();

        // инициализация поставщика платежей
        PaymentProvider paymentProvider = new PaymentProvider(bank);

        //инициализация БД
        DataBase dataBase = new DataBase();


        // инициализация сервиса обращения к БД покупателей
        CustomerProvider customerProvider = new CustomerProvider(dataBase);

        // инициализация сервиса обращения к БД билетов
        TicketProvider ticketProvider = new TicketProvider(dataBase, paymentProvider);

        // инициализация автобусной станции
        BusStation busStation = new BusStation(ticketProvider);

        // инициализация API для работы с клиентским приложением(MobileApp)
        TicketServiceApi ticketServiceApi = new TicketServiceApi(ticketProvider, customerProvider, busStation);

        // запуск приложения
        new MobileApp(ticketServiceApi).apiConnect();
    }
}
