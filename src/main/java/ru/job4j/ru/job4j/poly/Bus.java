package ru.job4j.ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public String drive() {
        return null;
    }

    @Override
    public String passengers(String number) {
        return null;
    }

    @Override
    public String refuel(String liters, String price) {
        return price;
    }
}
