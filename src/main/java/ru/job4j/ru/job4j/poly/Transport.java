package ru.job4j.ru.job4j.poly;

public interface Transport {
    String drive();

    String passengers(String number);

    String refuel(String liters, String price);
}
