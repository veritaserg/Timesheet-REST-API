package com.timesheet.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;



@Entity
@Table(name = "roles")
public class Role extends NamedEntity{

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<User> users;

    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private UserRole userRole;
    }

