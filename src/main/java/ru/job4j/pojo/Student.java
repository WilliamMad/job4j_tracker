package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fullName;
    private int group;
    private Date educationBegan;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getEducationBegan() {
        return educationBegan;
    }

    public void setEducationBegan(Date educationBegan) {
        this.educationBegan = educationBegan;
    }
}
