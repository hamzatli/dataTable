package com.dataTable.model;


import lombok.Data;
import lombok.Getter;

import javax.persistence.*;


@Entity
@Table(name = "columns")

public class Columns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private Integer age;

    @Column(name = "salary")
    private Integer salary;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }
}
