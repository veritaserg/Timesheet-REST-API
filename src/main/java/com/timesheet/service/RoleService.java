package com.timesheet.service;

import com.timesheet.model.Role;

public interface RoleService extends GenericService<Role, Long> {
    Role findByName(String name);
}
