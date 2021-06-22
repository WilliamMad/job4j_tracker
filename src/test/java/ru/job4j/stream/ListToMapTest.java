package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ListToMapTest {

    @Test
    public void studentMap() {
        List<Student> studentList = List.of(
                new Student(1, "Ivan"),
                new Student(2, "Petr"),
                new Student(2, "Petr"),
                new Student(1, "Ivan"));
        Map<String, Student> rsl = new ListToMap().studentMap(studentList);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Ivan", new Student(1, "Ivan"));
        expected.put("Petr", new Student(2, "Petr"));
        assertThat(rsl, is(expected));
    }
}