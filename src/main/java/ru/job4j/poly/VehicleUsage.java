package ru.job4j.poly;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle bus = (Vehicle) new Bus();
        Vehicle train = new Train();
        Vehicle plain = new Plain();

        Vehicle[] vehicles = new Vehicle[]{bus, train, plain};
        for (Vehicle i : vehicles) {
            i.move();
        }
    }
}
