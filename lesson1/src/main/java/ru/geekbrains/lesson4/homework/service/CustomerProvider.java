package ru.geekbrains.lesson4.homework.service;

import ru.geekbrains.lesson4.homework.entity.Customer;
import ru.geekbrains.lesson4.homework.entity.DataBase;

public class CustomerProvider {

    private DataBase dataBase;

    public CustomerProvider(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * проверка логина и пароля покупателя в БД
     *
     * @param login    логин
     * @param password пароль
     * @return boolean
     */
    public boolean checkCustomerLogin(String login, String password) {
        for (Customer customer : dataBase.getCustomerList()) {
            if (customer.getLogin().equals(login)) {
                if (customer.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * добавление покупателя в БД
     * если покупатель уже есть в БД, выдаст сообщение об этом
     * @param customer покупатель
     */
    public void addNewCustomerToDataBase(Customer customer) {
        for (Customer customer1 : dataBase.getCustomerList()) {
            if (customer.equals(customer1)) {
                System.out.println("Такой пользователь уже есть в БД.");
                return;
            }
        }
        dataBase.addCustomerToDataBase(customer);
    }

    /**
     * Выполняет поиск покупателя по логину и паролю и возвращает его
     * @param login
     * @param password
     * @return
     */
    public Customer getCustomer(String login, String password) {
        return dataBase.getCustomerList()
                .stream()
                .filter(customer -> customer.getLogin().equals(login) && customer.getPassword().equals(password))
                .findFirst().orElse(null);
    }
}
