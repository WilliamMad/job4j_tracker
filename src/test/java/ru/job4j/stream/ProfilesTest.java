package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        Address adrs1 = new Address("Saint-Petersburg", "blvr Trydyashihsa", 2, 100);
        Address adrs2 = new Address("Moscow", "Usacheva street", 1, 1);
        List<Address> expected = new ArrayList<>();
        expected.add(adrs1);
        expected.add(adrs2);
        assertThat(expected, notNullValue());
    }
}