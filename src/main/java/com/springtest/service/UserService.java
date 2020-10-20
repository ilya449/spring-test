package com.springtest.service;

import com.springtest.model.User;
import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User get(Long id);
}
