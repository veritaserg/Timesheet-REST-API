package com.timesheet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class NamedEntity extends BaseEntity {
    private String name;
}