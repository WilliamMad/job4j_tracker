package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortByIdItemTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("U", 3),
                new Item("G", 1),
                new Item("A", 7)
        );
        Collections.sort(items, new SortByIdItem());
        List<Item> expected = Arrays.asList(
                new Item("G", 1),
                new Item("U", 3),
                new Item("A", 7)
        );
        assertThat(items, is(expected));
    }
}