package com.timesheet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "positions")
@Getter
@Setter
public class Position extends NamedEntity{

    @Column(name="name")
    private String name;

    @Column(name = "department_id")
    private Long departmentId;
}
