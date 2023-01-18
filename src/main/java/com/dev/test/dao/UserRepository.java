package com.dev.test.dao;

import com.dev.test.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();
}
