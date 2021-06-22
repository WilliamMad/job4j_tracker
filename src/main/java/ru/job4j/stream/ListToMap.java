package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public Map<String, Student> studentMap(List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.toMap(Student::getSurname,
                        student -> student,
                        (existing, replacement) -> existing));
    }
}
