package com.projects.RestAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roLlNo;
    @Column(name = "stud_name")
    private String name;
    @Column(name = "stud_prnt")
    private float percentage;
    @Column(name = "stud_branch")
    private String branch;

    public Student(){

    }

    public Student(String name, float percentage, String branch) {
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    public int getRoLlNo() {
        return roLlNo;
    }

    public void setRoLlNo(int roLlNo) {
        this.roLlNo = roLlNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roLlNo=" + roLlNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", branch='" + branch + '\'' +
                '}';
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
