package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class SortByIdItemTest {

    @Test
    public void compareUp() {
        Item item1 = new Item("U");
        item1.setId(1);
        Item item2 = new Item("G");
        item2.setId(2);
        Item item3 = new Item("A");
        item3.setId(3);
        List<Item> items = Arrays.asList(item2, item1, item3);
        Collections.sort(items, new SortByIdItem());
        List<Item> expected = Arrays.asList(item1, item2, item3);
        assertThat(items, is(expected));
    }

    @Test
    public void compareDown() {
        Item item1 = new Item("U");
        item1.setId(1);
        Item item2 = new Item("G");
        item2.setId(2);
        Item item3 = new Item("A");
        item3.setId(3);
        List<Item> items = Arrays.asList(item2, item1, item3);
        Collections.sort(items, new SortByIdItemReverse());
        List<Item> expected = Arrays.asList(item3, item2, item1);
        assertThat(items, is(expected));
    }
}