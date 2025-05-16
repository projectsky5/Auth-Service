package com.projectsky.auth.mapper;

import com.projectsky.auth.dto.UserDto;
import com.projectsky.auth.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
}
