package com.timesheet.dto;

import com.timesheet.model.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RoleDto {

    private Long id;
    private String name;

    public static RoleDto fromRole(Role role) {
        return RoleDto.builder()
                .id(role.getId())
                .name(role.getName())
                .build();
    }

    public Role toRole(){
        Role role = new Role();
        role.setId(id);
        role.setName(name);

        return role;
    }
}
