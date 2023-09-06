package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.car_models.Car;
import ru.geekbrains.lesson3.car_models.Pickup;
import ru.geekbrains.lesson3.car_models.SportCar;
import ru.geekbrains.lesson3.car_models.parameters.BodyType;
import ru.geekbrains.lesson3.car_models.parameters.CarColor;
import ru.geekbrains.lesson3.car_models.parameters.FuelType;
import ru.geekbrains.lesson3.supports.detailing.CarWash;
import ru.geekbrains.lesson3.supports.detailing.Cleaning;
import ru.geekbrains.lesson3.supports.fuel_station.RefuelingStation;
import ru.geekbrains.lesson3.supports.maintenance_station.MaintenanceStation;

public class Program {

    /**
     * 1. Спроектировать абстрактный класс «Car» у которого должны
     *  быть свойства: марка, модель, цвет, тип кузова, число колёс, тип
     *  топлива, тип коробки передач, объём двигателя; методы:
     *  движение, обслуживание, переключение передач, включение
     *  фар, включение дворников.
     *
     * 2. Создать конкретный автомобиль путём наследования класса
     *  «Car».
     * 3. Расширить абстрактный класс «Car», добавить метод: подметать
     * улицу. Создать конкретный автомобиль путём наследования
     * класса «Car». Провести проверку принципа SRP.
     *
     * 4. Расширить абстрактный класс «Car», добавить метод:
     * включение противотуманных фар, перевозка груза. Провести
     * проверку принципа OCP.
     *
     * 5. Создать конкретный автомобиль путём наследования класса
     * «Car», определить число колёс = 3. Провести проверку принципа LSP.
     *
     * 6. Создать конкретный автомобиль путём наследования класса
     * «Car», определить метод «движение» - «полёт». Провести
     * проверку принципа LSP.
     *
     * 7. Создать интерфейс «Заправочная станция», создать метод:
     * заправка топливом.
     *
     *
     * 8. Имплементировать метод интерфейса «Заправочная станция» в
     * конкретный класс «Car».
     *
     * 9. Добавить в интерфейс «Заправочная станция» методы: протирка
     * лобового стекла, протирка фар, протирка зеркал.
     *
     * 10. Имплементировать все методы интерфейса «Заправочная
     * станция» в конкретный класс «Car». Провести проверку
     * принципа ISP. Создать дополнительный/е интерфейсы и
     * имплементировать их в конкретный класс «Car». Провести
     * проверку принципа ISP.
     *
     * 11. Создать путём наследования класса «Car» два
     * автомобиля: с бензиновым и дизельным двигателями,
     * имплементировать метод «Заправка топливом» интерфейса
     * «Заправочная станция». Реализовать заправку каждого
     * автомобиля подходящим топливом. Провести проверку принципа DIP.
     *
     * @param args
     */
    public static void main(String[] args) {

//        Car bmw = new SportCar("BMW", "M5", BodyType.COUPE, CarColor.GREEN, FuelType.GASOLINE, 250);
//        Trip trip = new Trip(bmw, new RefuelingStation("Lukoil"), new CarWash("Super Detailing"), new MaintenanceStation("Official Dealer"), 15000);
//
//        trip.start();

        Car car = new Pickup("TOYOTA", "SEQUOYA", BodyType.PICKUP, CarColor.WHITE, FuelType.DIESEL);

        Cleaning cleaning = new CarWash("self wash");

        cleaning.washCar(car);
    }
}
