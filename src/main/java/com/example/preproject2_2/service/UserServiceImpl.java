package com.example.preproject2_2.service;


import com.example.preproject2_2.Mappers.UserMapper;
import com.example.preproject2_2.dto.UserDto;
import com.example.preproject2_2.models.Role;
import com.example.preproject2_2.models.User;
import com.example.preproject2_2.repository.RoleRepository;
import com.example.preproject2_2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseEntity<List<UserDto>> findAll() {
        List<User> users = userRepository.findAll();
        if(users.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(userMapper.toDtoList(users), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserDto> findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return new ResponseEntity<>(userMapper.toDto(user.get()), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<UserDto> save(User user) {
        userRepository.save(user);
        return new ResponseEntity<>(userMapper.toDto(user), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserDto> update(User user, Long id) {
        user.setId(id);
        try{
            userRepository.save(user);
            return new ResponseEntity<>(userMapper.toDto(user),HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @Override
    public ResponseEntity<HttpStatus> deleteById(Long id) {
        try{
            userRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
    @Override
    public Iterable<Role> findAllRoles() {
        return roleRepository.findAll();
    }
}
