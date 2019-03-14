package com.timesheet.service.impl;

import com.timesheet.model.Employee;
import com.timesheet.repository.EmployeeRepository;
import com.timesheet.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long aLong) {
        return employeeRepository.getOne(aLong);
    }

    @Override
    public void delete(Employee employee) {
employeeRepository.delete(employee);
    }

    @Override
    public void deleteById(Long aLong) {
employeeRepository.deleteById(aLong);
    }
}
