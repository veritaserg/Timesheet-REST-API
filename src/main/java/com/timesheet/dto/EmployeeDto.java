package com.timesheet.dto;

import com.timesheet.model.Employee;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Long departmentId;
    private Long positionId;
    private BigDecimal hourlyRate;
        private Long userId;

    public static EmployeeDto fromEmployee(Employee employee) {
        return EmployeeDto.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .departmentId(employee.getDepartmentId())
                .positionId(employee.getPositionId())
                .hourlyRate(employee.getHourlyRate())
                .userId(employee.getUserId())
                .build();
    }

    public Employee toEmployee() {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setDepartmentId(departmentId);
        employee.setPositionId(positionId);
        employee.setHourlyRate(hourlyRate);
        employee.setUserId(userId);

        return employee;
    }


}
