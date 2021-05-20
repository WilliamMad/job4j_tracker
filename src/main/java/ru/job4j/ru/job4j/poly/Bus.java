package ru.job4j.ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(String number) {
        Scanner sc = new Scanner(System.in);
        number = sc.nextLine();
    }

    @Override
    public int refuel(int liters, int price) {
        Scanner sc = new Scanner(System.in);
        liters = sc.nextInt();
        return price * liters;
    }
}
