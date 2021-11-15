package com.example.api.Student;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",
    sequenceName ="student_sequence",
    allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "student_sequence")

    private Long id;
    private String name;
    private Integer age;
    private LocalDate date;
    private String email;


    public Student() {
    }

    public Student(Long id, String name, Integer age, LocalDate date, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.date = date;
        this.email = email;
    }

    public Student(String name, Integer age, LocalDate date, String email) {
        this.name = name;
        this.age = age;
        this.date = date;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", email='" + email + '\'' +
                '}';
    }
}
