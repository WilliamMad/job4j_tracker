package ru.job4j;

public class John extends Engineer {

    public John(String name, String surname, String education,
                double birthday, int buildingNumbers, String drawingName) {
        super(name, surname, education, birthday, buildingNumbers, drawingName);
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
