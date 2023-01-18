package com.dev.test.service.impl;

import com.dev.test.dao.UserRepository;
import com.dev.test.model.dto.UserDto;
import com.dev.test.service.UserService;
import com.dev.test.service.converter.UserConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    public UserServiceImpl(UserRepository userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.getAllUsers().stream()
                .map(userConverter::convertToDto)
                .collect(Collectors.toList());
    }
}
