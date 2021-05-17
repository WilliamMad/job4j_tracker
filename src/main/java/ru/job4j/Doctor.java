package ru.job4j;

public class Doctor extends Profession {
    private String diagnoses;
    private int sickNumber;

    public Doctor(String name, String surname, String education, double birthday,
                  String diagnoses, int sickNumber) {
        super(name, surname, education, birthday);
        this.diagnoses = diagnoses;
        this.sickNumber = sickNumber;
    }

    public String getDiagnoses() {
        return diagnoses;
    }

    public int getSickNumber() {
        return sickNumber;
    }
}
