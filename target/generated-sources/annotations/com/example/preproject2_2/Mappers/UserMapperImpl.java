package com.example.preproject2_2.Mappers;

import com.example.preproject2_2.dto.UserDto;
import com.example.preproject2_2.dto.UserDto.UserDtoBuilder;
import com.example.preproject2_2.models.Role;
import com.example.preproject2_2.models.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-13T21:03:03+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDtoBuilder userDto = UserDto.builder();

        userDto.id( user.getId() );
        Set<Role> set = user.getRoles();
        if ( set != null ) {
            userDto.roles( new HashSet<Role>( set ) );
        }
        userDto.username( user.getUsername() );
        userDto.email( user.getEmail() );

        return userDto.build();
    }

    @Override
    public List<UserDto> toDtoList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( users.size() );
        for ( User user : users ) {
            list.add( toDto( user ) );
        }

        return list;
    }
}
