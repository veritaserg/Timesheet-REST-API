package com.timesheet.service.impl;

import com.timesheet.model.Role;
import com.timesheet.repository.RoleRepository;
import com.timesheet.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiseImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role save(Role role) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(Role role) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Role findByName(String name) {
        return null;
    }
}
