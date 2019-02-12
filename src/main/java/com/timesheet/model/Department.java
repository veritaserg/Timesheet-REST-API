package com.timesheet.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@Getter
@Setter
public class Department extends NamedEntity {

    @Column(name="name")
    private String name;
}
