package com.timesheet.service;

import org.springframework.security.core.Authentication;

import java.util.Optional;

public interface SecurityService {
    Optional<String> findLoggedInUsername();

    void autologin(String username, String password);
    Authentication getAuthentication();
}
