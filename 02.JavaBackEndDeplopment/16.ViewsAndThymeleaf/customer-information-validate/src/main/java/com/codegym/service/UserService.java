package com.codegym.service;

import com.codegym.model.User;

import java.util.List;

public interface UserService {
    Iterable<User> findAll();
    void save(User user);
    User findById(Long id);
    void remove(Long id);
}
