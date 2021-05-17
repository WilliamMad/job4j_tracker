package ru.job4j;

public class Tom extends Doctor {

    public Tom(String name, String surname, String education, double birthday,
               String diagnoses, int sickNumber) {
        super(name, surname, education, birthday, diagnoses, sickNumber);
    }

    public String getName() {
        return super.getName();
    }

    public String getSurname() {
        return super.getSurname();
    }

    public String getEducation() {
        return super.getEducation();
    }

    public double getBirthday() {
        return super.getBirthday();
    }
}
