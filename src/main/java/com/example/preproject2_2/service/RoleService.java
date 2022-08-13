package com.example.preproject2_2.service;

import com.example.preproject2_2.models.ERole;
import com.example.preproject2_2.models.Role;

import java.util.Optional;

public interface RoleService {

    Optional<Role> findByName(ERole name);
}
