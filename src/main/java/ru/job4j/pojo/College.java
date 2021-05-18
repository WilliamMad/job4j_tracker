package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setEducationBegan(new Date());
        student.setGroup(404);
        System.out.println("ФИО студента: " + student.getFullName() + System.lineSeparator()
        + "Группа: " + student.getGroup() + System.lineSeparator()
        + "Дата начала обучения: " + student.getEducationBegan());
    }
}
