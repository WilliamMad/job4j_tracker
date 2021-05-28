package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person index : persons) {
            if (index.getName().equals(key) || index.getPhone().equals(key)
            || index.getAddress().equals(key) || index.getSurname().equals(key)) {
                result.add(index);
                System.out.println(index);
            }
        }
        return result;
    }
}
