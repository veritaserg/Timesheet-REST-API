package com.timesheet.model;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee extends NamedEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "department_id")
    private Long departmentId;

    @Column(name = "position_id")
    private Long positionId;

    @Column(name = "hourly_rate")
    private BigDecimal hourlyRate;

    @Column(name = "user_id")
    private Long userId;
}
