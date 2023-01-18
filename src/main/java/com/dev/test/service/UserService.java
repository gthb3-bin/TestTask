package com.dev.test.service;

import com.dev.test.model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
}
