package com.projectsky.auth.service;

import com.projectsky.auth.dto.UserDto;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface UserService {

    String addUser(UserDto userDto);

    UserDto getUserById(String id) throws ChangeSetPersister.NotFoundException;

    UserDto getUserByEmail(String email) throws ChangeSetPersister.NotFoundException;
}
