package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("U", 3),
                new Item("G", 1),
                new Item("A", 7)
        );
        System.out.println(items);
        Collections.sort(items, new SortByIdItem());
        System.out.println(items);
        Collections.sort(items, new SortByIdItemReverse());
        System.out.println(items);
        Collections.sort(items, new SortByNameItem());
        System.out.println(items);
        Collections.sort(items, new SortByNameItemReverse());
        System.out.println(items);
    }
}
