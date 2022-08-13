package com.example.preproject2_2.dto;

import com.example.preproject2_2.models.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;
    private Set<Role> roles;
    private String username;
    private String email;
}
