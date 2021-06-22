package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public Map<String, Student> studentMap(List<Student> studentList) {
        Map<String, Student> studentMap = studentList.stream()
                .distinct()
                .collect(Collectors.toMap(student -> student.getSurname(), student -> student));
        return studentMap;
    }
}
