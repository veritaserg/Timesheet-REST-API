package com.timesheet.dto;

import com.timesheet.model.Department;
import lombok.*;

@Getter
@Setter
@Builder
public class DepartmentDto {
    private Long id;
    private String name;

    public static DepartmentDto fromDepartment(Department department) {
        return DepartmentDto.builder()
                .id(department.getId())
                .name(department.getName())
                .build();
    }

    public Department toDepartmen() {
        Department department = new Department();
        department.setId(id);
        department.setName(name);

        return department;
    }
}