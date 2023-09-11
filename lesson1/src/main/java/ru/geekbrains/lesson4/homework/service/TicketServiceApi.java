package ru.geekbrains.lesson4.homework.service;


import ru.geekbrains.lesson4.homework.entity.BusStation;
import ru.geekbrains.lesson4.homework.entity.Customer;
import ru.geekbrains.lesson4.homework.exception.TicketNotFoundException;

import java.util.Scanner;

public class TicketServiceApi {

    private TicketProvider ticketProvider;

    private CustomerProvider customerProvider;

    private BusStation busStation;


    public TicketServiceApi(TicketProvider ticketProvider, CustomerProvider customerProvider, BusStation busStation) {
        this.ticketProvider = ticketProvider;
        this.customerProvider = customerProvider;
        this.busStation = busStation;
    }

    /**
     * API для взаимодействия с пользовательским приложением
     */
    public void connect() {

        Scanner scanner = new Scanner(System.in);
        String value;

        while (true) {

            System.out.println("===========================================");
            System.out.println("добавить нового пользователя, введите: NEW");
            System.out.println("Войти в систему покупки билетов, введите IN");
            System.out.println("Список всех проданных билетов: TL");
            System.out.println("Предъявить билет: BUS");
            System.out.print(">>> ");

            value = scanner.nextLine();

            while (true) {

                if (value.equalsIgnoreCase("NEW")) {
                    System.out.print("Введите вашу фамилию: ");
                    String surname = scanner.nextLine();
                    System.out.print("Введите ваше имя: ");
                    String name = scanner.nextLine();
                    Customer customer = new Customer(name, surname);
                    customerProvider.addNewCustomerToDataBase(customer);
                    System.out.printf("Ваш логин: %s Пароль: %s\n", customer.getLogin(), customer.getPassword());
                    System.out.println("Чтобы купить билет нужно войти заново");
                    ticketProvider.getPaymentProvider().getBank().setCustomerToCard(customer);
                    break;
                }

                if (value.equalsIgnoreCase("IN")) {
                    System.out.print("Введите ваш логин: ");
                    String login = scanner.nextLine();
                    System.out.print("Введите ваш пароль: ");
                    String password = scanner.nextLine();
                    if (!customerProvider.checkCustomerLogin(login, password)) {
                        System.out.println("Неверный логин или пароль. Повторите ввод.");
                    } else {
                        Customer customer = customerProvider.getCustomer(login, password);
                        System.out.println("Хотите купить билет? Y/N");
                        value = scanner.nextLine();
                        if (value.equalsIgnoreCase("Y")) {
                            ticketProvider.buyTicket(customer);
                            try {
                                System.out.printf("Билет #%s Секретный код %s Покупатель: %s %s\n",
                                        ticketProvider.getTicket(customer).getId(),
                                        ticketProvider.getTicket(customer).getSecretCode(),
                                        customer.getName(),
                                        customer.getSurname());
                                break;
                            } catch (TicketNotFoundException e) {
                                System.out.println("Билет не найден.");
                            }
                        }
                        if (value.equalsIgnoreCase("N")) {
                            System.out.println("До свидания!!!");
                            return;
                        }
                    }
                    break;
                }

                if (value.equalsIgnoreCase("TL")) {
                    System.out.println("===========================================");
                    ticketProvider.ticketList().stream()
                            .filter(ticket -> ticket.getCustomer() != null)
                            .forEach(ticket -> System.out.printf("%d %s %s %s\n",
                                    ticket.getId(), ticket.getSecretCode(),
                                    ticket.getCustomer().getName(), ticket.getCustomer().getSurname()));
                    System.out.println("===========================================");
                    break;
                }
                if (value.equalsIgnoreCase("BUS")) {
                    System.out.print("Введите номер билета: ");
                    int ticketNumber = Integer.parseInt(scanner.nextLine());
                    System.out.print("Введите секретный код: ");
                    String secretCode = scanner.nextLine();
                    if (busStation.checkTicket(ticketNumber, secretCode)) {
                        System.out.println("== ДАННЫЕ ВЕРНЫ. ХОРОШЕЙ ПОЕЗДКИ. ==");
                        break;
                    }
                    System.out.println("!! НЕВЕРНЫЕ ДАННЫЕ !!");
                    break;
                }
            }
        }
    }
}
