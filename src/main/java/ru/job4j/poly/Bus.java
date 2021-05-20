package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Еду");
    }

    @Override
    public void passengers(int number) {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
    }

    @Override
    public int refuel(int liters) {
        Scanner sc = new Scanner(System.in);
        liters = sc.nextInt();
        int price = 50;
        return liters * price;
    }
}
