package ru.geekbrains.lesson4.homework.exception;

/**
 * Исключение "Билет не найден в БД"
 */
public class TicketNotFoundException extends Exception{

    public TicketNotFoundException(String message) {
        super(message);
    }
}
