package com.timesheet.service.impl;

import com.timesheet.model.Department;
import com.timesheet.repository.DepartmentRepository;
import com.timesheet.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(Long aLong) {
        return departmentRepository.getOne(aLong);
    }

    @Override
    public void delete(Department department) {
departmentRepository.delete(department);
    }

    @Override
    public void deleteById(Long aLong) {
departmentRepository.deleteById(aLong);
    }

}
