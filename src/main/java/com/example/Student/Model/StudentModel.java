package com.example.Student.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "cse")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String grade;

    @Column
    private String department;

    public StudentModel() {
    }

    public StudentModel(int id, String name, String grade, String department) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.department = department;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "StudentModel [id=" + id + ", name=" + name + ", grade=" + grade + ", department=" + department + "]";
    }
}
