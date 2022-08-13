package com.example.preproject2_2.pojo;

import com.example.preproject2_2.models.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class SignupRequest {

    private String username;
    private String email;
    private Set<String> roles;
    private String password;
}
