package com.springtest.dao;

import com.springtest.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
