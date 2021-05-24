package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calcPositiveNumber() {
        Fact.calc(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calcNegativeNumber() {
        Fact.calc(-5);
    }

}