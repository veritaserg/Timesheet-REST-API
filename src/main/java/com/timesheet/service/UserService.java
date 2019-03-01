package com.timesheet.service;

import com.timesheet.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService extends GenericService<User, Long>{
     Optional<User> findByUsername(String username);

}
