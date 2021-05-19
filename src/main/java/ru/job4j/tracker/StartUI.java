package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Something", 1));
        System.out.println(tracker.findById(1));
        Item item = new Item("Anything", 2);
        System.out.println(item);
        Item[] result = tracker.findByName("Something");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

