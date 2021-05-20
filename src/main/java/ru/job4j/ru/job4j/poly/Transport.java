package ru.job4j.ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(String number);

    int refuel(int liters, int price);
}
