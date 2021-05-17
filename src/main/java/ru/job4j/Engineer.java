package ru.job4j;

public class Engineer extends Profession {
    private int buildingNumbers;
    private String drawingName;

    public Engineer(String name, String surname, String education,
                    double birthday, int buildingNumbers, String drawingName) {
        super(name, surname, education, birthday);
        this.buildingNumbers = buildingNumbers;
        this.drawingName = drawingName;
    }

    public int getBuildingNumbers() {
        return buildingNumbers;
    }

    public String getDrawingName() {
        return drawingName;
    }

}

