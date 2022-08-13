package com.example.preproject2_2.service;

import com.example.preproject2_2.dto.UserDto;
import com.example.preproject2_2.models.Role;
import com.example.preproject2_2.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Iterable<Role> findAllRoles();
    ResponseEntity<List<UserDto>> findAll();
    ResponseEntity<UserDto> findById(Long id);
    ResponseEntity<UserDto> save(User user);
    ResponseEntity<UserDto> update(User user, Long id);
    ResponseEntity<HttpStatus> deleteById(Long id);
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
