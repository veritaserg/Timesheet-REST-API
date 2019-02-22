package com.timesheet.dto;

import com.timesheet.model.Role;
import com.timesheet.model.Status;
import com.timesheet.model.User;
import com.timesheet.model.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Getter
@Setter
@Builder
public class UserDto {

    private Long id;
    private String username;
    private List<RoleDto> roles;
    private String status;
    private String userType;


    public static UserDto fromUser(User user) {
        List<RoleDto> userRoles = new ArrayList<>();
        user.getRoles().forEach(role -> userRoles.add(RoleDto.fromRole(role)));

        UserDto userDto = UserDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .roles(userRoles)
                .status(user.getStatus().name())
                .build();


        return userDto;
    }

    public User toUser() {
        Set<Role> userRoles = new TreeSet<>();
        roles.forEach(roleDto -> userRoles.add(roleDto.toRole()));

        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setRoles(userRoles);
        user.setStatus(Status.valueOf(status));

        return user;
    }
}
