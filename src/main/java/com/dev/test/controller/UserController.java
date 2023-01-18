package com.dev.test.controller;

import com.dev.test.model.dto.UserDto;
import com.dev.test.service.UserService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Api(tags = "Users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // In real task RequestParam such as sortBy, sortOrder, page, size with required = false and default values
    // should be added here if business logic needs. And in that case return parameter will be
    // smth like UserPageDto with list of content and page + size
    @GetMapping
    @ApiOperation(value = "Getting all users with cars")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }
}
