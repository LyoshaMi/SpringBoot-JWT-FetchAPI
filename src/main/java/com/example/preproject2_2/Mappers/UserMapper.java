package com.example.preproject2_2.Mappers;

import com.example.preproject2_2.dto.UserDto;
import com.example.preproject2_2.models.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto (User user);
    List<UserDto> toDtoList(List<User> users);
}
