package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance3d() {
        double expected = 3.464;
        Point a = new Point(2, 0, 2);
        Point b = new Point(0, 2, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d2() {
        double expected = 2.828;
        Point a = new Point(0, 0, 2);
        Point b = new Point(2, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}