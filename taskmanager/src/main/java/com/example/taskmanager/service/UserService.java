package com.example.taskmanager.service;
import com.example.taskmanager.entity.User;
import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findByUsername(String username);
}
